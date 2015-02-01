package com.tragicfruit.duckworthlewiscalculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Jeremy on 1/02/2015.
 * TODO: Simplify interruptions dialog
 */
public class InterruptionFragment extends DialogFragment {

    public static final String EXTRA_MAX_OVERS = "com.tragicfruit.duckworthlewiscalculator.total_overs";
    public static final String EXTRA_NEW_TOTAL_OVERS = "com.tragicfruit.duckworthlewiscalculator.new_total_overs";
    public static final String EXTRA_WICKETS = "com.tragicfruit.duckworthlewiscalculator.wickets";
    public static final String EXTRA_BEFORE_OVERS = "com.tragicfruit.duckworthlewiscalculator.before_overs";
    public static final String EXTRA_AFTER_OVERS = "com.tragicfruit.duckworthlewiscalculator.after_overs";

    private int mWicketsRemaining; // wickets in hand after interruption
    private int mBeforeOvers; // number of overs remaining before interruption
    private int mAfterOvers; // number of overs remaining after interruption

    private int mOldTotalOvers; // max overs in innings
    private int mNewTotalOvers;

    private EditText mWicketsField;
    private EditText mOversField;
    private EditText mNewTotalOversField;

    public static InterruptionFragment newInstance(int totalOvers) {
        Bundle args = new Bundle();
        args.putInt(EXTRA_MAX_OVERS, totalOvers);

        InterruptionFragment fragment = new InterruptionFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOldTotalOvers = getArguments().getInt(EXTRA_MAX_OVERS);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = getActivity().getLayoutInflater()
                .inflate(R.layout.dialog_interruption, null);

        mWicketsField = (EditText) v.findViewById(R.id.interruption_wickets_editText);
        mOversField = (EditText) v.findViewById(R.id.interruption_overs_completed);
        mNewTotalOversField = (EditText) v.findViewById(R.id.interruption_new_total_overs);

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
                        }
                    }
                })
                .create();
    }

    private boolean isValidInput() {
        try {
            mNewTotalOvers = Integer.parseInt(mNewTotalOversField.getText().toString());
            mWicketsRemaining = 10 - Integer.parseInt(mWicketsField.getText().toString());
            mBeforeOvers = mOldTotalOvers - Integer.parseInt(mOversField.getText().toString());
            mAfterOvers = mBeforeOvers - (mOldTotalOvers - mNewTotalOvers);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void setResult(int result) {
        Intent data = new Intent();
        data.putExtra(EXTRA_WICKETS, mWicketsRemaining);
        data.putExtra(EXTRA_BEFORE_OVERS, mBeforeOvers);
        data.putExtra(EXTRA_AFTER_OVERS, mAfterOvers);
        data.putExtra(EXTRA_NEW_TOTAL_OVERS, mNewTotalOvers);

        getTargetFragment().onActivityResult(getTargetRequestCode(), result, data);
    }

}
