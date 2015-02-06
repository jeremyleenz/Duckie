package com.tragicfruit.duckie;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Jeremy on 1/02/2015.
 * TODO: Simplify interruptions dialog
 */
public class InterruptionFragment extends DialogFragment {
    public static final String EXTRA_INPUT_RUNS = "com.tragicfruit.duckie.input_runs";
    public static final String EXTRA_INPUT_WICKETS = "com.tragicfruit.duckie.input_wickets";
    public static final String EXTRA_INPUT_OVERS_COMPLETED = "com.tragicfruit.duckie.input_overs_completed";
    public static final String EXTRA_INPUT_NEW_TOTAL_OVERS = "com.tragicfruit.duckie.input_new_total_overs";

    private int mInputRuns;
    private int mInputWickets;
    private int mInputOversCompleted;
    private int mInputNewTotalOvers;

    private EditText mRunsField;
    private EditText mWicketsField;
    private EditText mOversField;
    private EditText mNewTotalOversField;

    // Editing existing interruption
    public static InterruptionFragment newInstance(int inputRuns, int inputWickets,
                                                   int inputOversCompleted, int inputNewTotalOvers) {
        Bundle args = new Bundle();
        args.putInt(EXTRA_INPUT_RUNS, inputRuns);
        args.putInt(EXTRA_INPUT_WICKETS, inputWickets);
        args.putInt(EXTRA_INPUT_OVERS_COMPLETED, inputOversCompleted);
        args.putInt(EXTRA_INPUT_NEW_TOTAL_OVERS, inputNewTotalOvers);

        InterruptionFragment fragment = new InterruptionFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = getActivity().getLayoutInflater()
                .inflate(R.layout.dialog_interruption, null);

        mRunsField = (EditText) v.findViewById(R.id.interruption_runs_editText);
        mWicketsField = (EditText) v.findViewById(R.id.interruption_wickets_editText);
        mOversField = (EditText) v.findViewById(R.id.interruption_overs_completed);
        mNewTotalOversField = (EditText) v.findViewById(R.id.interruption_new_total_overs);

        if (getArguments() != null) {
            mRunsField.setText("" + getArguments().getInt(EXTRA_INPUT_RUNS, -1));
            mWicketsField.setText("" + getArguments().getInt(EXTRA_INPUT_WICKETS, -1));
            mOversField.setText("" + getArguments().getInt(EXTRA_INPUT_OVERS_COMPLETED, -1));
            mNewTotalOversField.setText("" + getArguments().getInt(EXTRA_INPUT_NEW_TOTAL_OVERS, -1));
        }

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle("Interruption details")
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (isValidInput()) {
                            setResult(Activity.RESULT_OK);
                        } else {
                            setResult(Activity.RESULT_CANCELED);
                            Toast.makeText(getActivity(), "Invalid input", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .create();
    }

    private boolean isValidInput() {
        try {
            // TODO: checks on valid # of overs etc.
            mInputRuns = Integer.parseInt(mRunsField.getText().toString());
            mInputWickets = Integer.parseInt(mWicketsField.getText().toString());
            mInputOversCompleted = Integer.parseInt(mOversField.getText().toString());
            mInputNewTotalOvers = Integer.parseInt(mNewTotalOversField.getText().toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void setResult(int result) {
        Intent data = new Intent();
        data.putExtra(EXTRA_INPUT_RUNS, mInputRuns);
        data.putExtra(EXTRA_INPUT_WICKETS, mInputWickets);
        data.putExtra(EXTRA_INPUT_OVERS_COMPLETED, mInputOversCompleted);
        data.putExtra(EXTRA_INPUT_NEW_TOTAL_OVERS, mInputNewTotalOvers);

        getTargetFragment().onActivityResult(getTargetRequestCode(), result, data);
    }

}