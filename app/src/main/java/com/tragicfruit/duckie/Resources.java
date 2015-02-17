package com.tragicfruit.duckie;

/**
 * Created by Jeremy on 1/02/2015.
 * References resource table from ICC Playing Handbook 2013-14
 */
public class Resources {
    public static double getPercentage(int oversRemaining, int wicketsRemaining) {
        return percentage[50 - oversRemaining][10 - wicketsRemaining];
    }

    // Over by over
    private static final double[][] percentage = {
        {100.0, 93.4, 85.1, 74.9, 62.7, 49.0, 34.9, 22.0, 11.9, 4.7}, //50
        {99.1, 92.6, 84.5, 74.4, 62.5, 48.9, 34.9, 22.0, 11.9, 4.7}, //49
        {98.1, 91.7, 83.8, 74.0, 62.2, 48.8, 34.9, 22.0, 11.9, 4.7}, //48
        {97.1, 90.9, 83.2, 73.5, 61.9, 48.6, 34.9, 22.0, 11.9, 4.7}, //47
        {96.1, 90.0, 82.5, 73.0, 61.6, 48.5, 34.8, 22.0, 11.9, 4.7}, //46
        {95.0, 89.1, 81.8, 72.5, 61.3, 48.4, 34.8, 22.0, 11.9, 4.7}, //45
        {93.9, 88.2, 81.0, 72.0, 61.0, 48.3, 34.8, 22.0, 11.9, 4.7}, //44
        {92.8, 87.3, 80.3, 71.4, 60.7, 48.1, 34.7, 22.0, 11.9, 4.7}, //43
        {91.7, 86.3, 79.5, 70.9, 60.3, 47.9, 34.7, 22.0, 11.9, 4.7}, //42
        {90.5, 85.3, 78.7, 70.3, 59.9, 47.8, 34.6, 22.0, 11.9, 4.7}, //41
        {89.3, 84.2, 77.8, 69.6, 59.5, 47.6, 34.6, 22.0, 11.9, 4.7}, //40
        {88.0, 83.1, 76.9, 69.0, 59.1, 47.4, 34.5, 22.0, 11.9, 4.7}, //39
        {86.7, 82.0, 76.0, 68.3, 58.7, 47.1, 34.5, 21.9, 11.9, 4.7}, //38
        {85.4, 80.9, 75.0, 67.6, 58.2, 46.9, 34.4, 21.9, 11.9, 4.7}, //37
        {84.1, 79.7, 74.1, 66.8, 57.7, 46.6, 34.3, 21.9, 11.9, 4.7}, //36
        {82.7, 78.5, 73.0, 66.0, 57.2, 46.4, 34.2, 21.9, 11.9, 4.7}, //35
        {81.3, 77.2, 72.0, 65.2, 56.6, 46.1, 34.1, 21.9, 11.9, 4.7}, //34
        {79.8, 75.9, 70.9, 64.4, 56.0, 45.8, 34.0, 21.9, 11.9, 4.7}, //33
        {78.3, 74.6, 69.7, 63.5, 55.4, 45.4, 33.9, 21.9, 11.9, 4.7}, //32
        {76.7, 73.2, 68.6, 62.5, 54.8, 45.1, 33.7, 21.9, 11.9, 4.7}, //31
        {75.1, 71.8, 67.3, 61.6, 54.1, 44.7, 33.6, 21.8, 11.9, 4.7}, //30
        {73.5, 70.3, 66.1, 60.5, 53.4, 44.2, 33.4, 21.8, 11.9, 4.7}, //29
        {71.8, 68.8, 64.8, 59.5, 52.6, 43.8, 33.2, 21.8, 11.9, 4.7}, //28
        {70.1, 67.2, 63.4, 58.4, 51.8, 43.3, 33.0, 21.7, 11.9, 4.7}, //27
        {68.3, 65.6, 62.0, 57.2, 50.9, 42.8, 32.8, 21.7, 11.9, 4.7}, //26
        {66.5, 63.9, 60.5, 56.0, 50.0, 42.2, 32.6, 21.6, 11.9, 4.7}, //25
        {64.6, 62.2, 59.0, 54.7, 49.0, 41.6, 32.3, 21.6, 11.9, 4.7}, //24
        {62.7, 60.4, 57.4, 53.4, 48.0, 40.9, 32.0, 21.5, 11.9, 4.7}, //23
        {60.7, 58.6, 55.8, 52.0, 47.0, 40.2, 31.6, 21.4, 11.9, 4.7}, //22
        {58.7, 56.7, 54.1, 50.6, 45.8, 39.4, 31.2, 21.3, 11.9, 4.7}, //21
        {56.6, 54.8, 52.4, 49.1, 44.6, 38.6, 30.8, 21.2, 11.9, 4.7}, //20
        {54.4, 52.8, 50.5, 47.5, 43.4, 37.7, 30.3, 21.1, 11.9, 4.7}, //19
        {52.2, 50.7, 48.6, 45.9, 42.0, 36.8, 29.8, 20.9, 11.9, 4.7}, //18
        {49.9, 48.5, 46.7, 44.1, 40.6, 35.8, 29.2, 20.7, 11.9, 4.7}, //17
        {47.6, 46.3, 44.7, 42.3, 39.1, 34.7, 28.5, 20.5, 11.8, 4.7}, //16
        {45.2, 44.1, 42.6, 40.5, 37.6, 33.5, 27.8, 20.2, 11.8, 4.7}, //15
        {42.7, 41.7, 40.4, 38.5, 35.9, 32.2, 27.0, 19.9, 11.8, 4.7}, //14
        {40.2, 39.3, 38.1, 36.5, 34.2, 30.8, 26.1, 19.5, 11.7, 4.7}, //13
        {37.6, 36.8, 35.8, 34.3, 32.3, 29.4, 25.1, 19.0, 11.6, 4.7}, //12
        {34.9, 34.2, 33.4, 32.1, 30.4, 27.8, 24.0, 18.5, 11.5, 4.7}, //11
        {32.1, 31.6, 30.8, 29.8, 28.3, 26.1, 22.8, 17.9, 11.4, 4.7}, //10
        {29.3, 28.9, 28.2, 27.4, 26.1, 24.2, 21.4, 17.1, 11.2, 4.7}, //9
        {26.4, 26.0, 25.5, 24.8, 23.8, 22.3, 19.9, 16.2, 10.9, 4.7}, //8
        {23.4, 23.1, 22.7, 22.2, 21.4, 20.1, 18.2, 15.2, 10.5, 4.7}, //7
        {20.3, 20.1, 19.8, 19.4, 18.8, 17.8, 16.4, 13.9, 10.1, 4.6}, //6
        {17.2, 17.0, 16.8, 16.5, 16.1, 15.4, 14.3, 12.5, 9.4, 4.6}, //5
        {13.9, 13.8, 13.7, 13.5, 13.2, 12.7, 12.0, 10.7, 8.4, 4.5}, //4
        {10.6, 10.5, 10.4, 10.3, 10.2, 9.9, 9.5, 8.7, 7.2, 4.2}, //3
        {7.2, 7.1, 7.1, 7.0, 7.0, 6.8, 6.6, 6.2, 5.5, 3.7}, //2
        {3.6, 3.6, 3.6, 3.6, 3.6, 3.5, 3.5, 3.4, 3.2, 2.5}, //1
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //0
    };

    // Ball by ball
    /*private static double[][] percentage = {
            {100.0, 93.4, 85.1, 74.9, 62.7, 49.0, 34.9, 22.0, 11.9, 4.7}, //50
            {99.8, 93.2, 85.0, 74.8, 62.7, 49.0, 34.9, 22.0, 11.9, 4.7}, //49.5
            {99.7, 93.1, 84.9, 74.7, 62.6, 48.9, 34.9, 22.0, 11.9, 4.7}, //49.4
            {99.5, 93.0, 84.8, 74.6, 62.6, 48.9, 34.9, 22.0, 11.9, 4.7}, //49.3
            {99.4, 92.8, 84.7, 74.6, 62.5, 48.9, 34.9, 22.0, 11.9, 4.7}, //49.2
            {99.2, 92.7, 84.6, 74.5, 62.5, 48.9, 34.9, 22.0, 11.9, 4.7}, //49.1
            {99.1, 92.6, 84.5, 74.4, 62.5, 48.9, 34.9, 22.0, 11.9, 4.7}, //49
            {98.9, 92.4, 84.4, 74.4, 62.4, 48.9, 34.9, 22.0, 11.9, 4.7}, //48.5
            {98.7, 92.3, 84.3, 74.3, 62.4, 48.8, 34.9, 22.0, 11.9, 4.7}, //48.4
            {98.6, 92.2, 84.2, 74.2, 62.3, 48.8, 34.9, 22.0, 11.9, 4.7}, //48.3
            {98.4, 92.0, 84.0, 74.1, 62.3, 48.8, 34.9, 22.0, 11.9, 4.7}, //48.2
            {98.2, 91.9, 83.9, 74.1, 62.2, 48.8, 34.9, 22.0, 11.9, 4.7}, //48.1
            {98.1, 91.7, 83.8, 74.0, 62.2, 48.8, 34.9, 22.0, 11.9, 4.7}, //48
            {97.9, 91.6, 83.7, 73.9, 62.2, 48.7, 34.9, 22.0, 11.9, 4.7}, //47.5
            {97.8, 91.5, 83.6, 73.8, 62.1, 48.7, 34.9, 22.0, 11.9, 4.7}, //47.4
            {97.6, 91.3, 83.5, 73.8, 62.1, 48.7, 34.9, 22.0, 11.9, 4.7}, //47.3
            {97.4, 91.2, 83.4, 73.7, 62.0, 48.7, 34.9, 22.0, 11.9, 4.7}, //47.2
            {97.3, 91.0, 83.3, 73.6, 62.0, 48.7, 34.9, 22.0, 11.9, 4.7}, //47.1
            {97.1, 90.9, 83.2, 73.5, 61.9, 48.6, 34.9, 22.0, 11.9, 4.7}, //47
            {96.9, 90.8, 83.1, 73.4, 61.9, 48.6, 34.9, 22.0, 11.9, 4.7}, //46.5
            {96.7, 90.6, 82.9, 73.4, 61.8, 48.6, 34.9, 22.0, 11.9, 4.7}, //46.4
            {96.6, 90.5, 82.8, 73.3, 61.8, 48.6, 34.8, 22.0, 11.9, 4.7}, //46.3
            {96.4, 90.3, 82.7, 73.2, 61.7, 48.6, 34.8, 22.0, 11.9, 4.7}, //46.2
            {96.2, 90.2, 82.6, 73.1, 61.7, 48.5, 34.8, 22.0, 11.9, 4.7}, //46.1
            {96.1, 90.0, 82.5, 73.0, 61.6, 48.5, 34.8, 22.0, 11.9, 4.7}, //46
            {95.9, 89.9, 82.4, 73.0, 61.6, 48.5, 34.8, 22.0, 11.9, 4.7}, //45.5
            {95.7, 89.7, 82.3, 72.9, 61.5, 48.5, 34.8, 22.0, 11.9, 4.7}, //45.4
            {95.5, 89.6, 82.1, 72.8, 61.5, 48.5, 34.8, 22.0, 11.9, 4.7}, //45.3
            {95.4, 89.4, 82.0, 72.7, 61.4, 48.4, 34.8, 22.0, 11.9, 4.7}, //45.2
            {95.2, 89.3, 81.9, 72.6, 61.4, 48.4, 34.8, 22.0, 11.9, 4.7}, //45.1
            {95.0, 89.1, 81.8, 72.5, 61.3, 48.4, 34.8, 22.0, 11.9, 4.7}, //45
            {94.8, 89.0, 81.7, 72.4, 61.3, 48.4, 34.8, 22.0, 11.9, 4.7}, //44.5
            {94.6, 88.8, 81.5, 72.4, 61.2, 48.3, 34.8, 22.0, 11.9, 4.7}, //44.4
            {94.5, 88.7, 81.4, 72.3, 61.2, 48.3, 34.8, 22.0, 11.9, 4.7}, //44.3
            {94.3, 88.5, 81.3, 72.2, 61.1, 48.3, 34.8, 22.0, 11.9, 4.7}, //44.2
            {94.1, 88.4, 81.2, 72.1, 61.1, 48.3, 34.8, 22.0, 11.9, 4.7}, //44.1
            {93.9, 88.2, 81.0, 72.0, 61.0, 48.3, 34.8, 22.0, 11.9, 4.7}, //44
            {93.7, 88.1, 80.9, 71.9, 61.0, 48.2, 34.8, 22.0, 11.9, 4.7}, //43.5
            {93.5, 87.9, 80.8, 71.8, 60.9, 48.2, 34.8, 22.0, 11.9, 4.7}, //43.4
            {93.4, 87.7, 80.7, 71.7, 60.8, 48.2, 34.7, 22.0, 11.9, 4.7}, //43.3
            {93.2, 87.6, 80.5, 71.6, 60.8, 48.1, 34.7, 22.0, 11.9, 4.7}, //43.2
            {93.0, 87.4, 80.4, 71.5, 60.7, 48.1, 34.7, 22.0, 11.9, 4.7}, //43.1
            {92.8, 87.3, 80.3, 71.4, 60.7, 48.1, 34.7, 22.0, 11.9, 4.7}, //43
            {92.6, 87.1, 80.1, 71.3, 60.6, 48.1, 34.7, 22.0, 11.9, 4.7}, //42.5
            {92.4, 86.9, 80.0, 71.3, 60.6, 48.0, 34.7, 22.0, 11.9, 4.7}, //42.4
            {92.2, 86.8, 79.9, 71.2, 60.5, 48.0, 34.7, 22.0, 11.9, 4.7}, //42.3
            {92.0, 86.6, 79.7, 71.1, 60.4, 48.0, 34.7, 22.0, 11.9, 4.7}, //42.2
            {91.8, 86.4, 79.6, 71.0, 60.4, 48.0, 34.7, 22.0, 11.9, 4.7}, //42.1
            {91.7, 86.3, 79.5, 70.9, 60.3, 47.9, 34.7, 22.0, 11.9, 4.7}, //42
            {91.5, 86.1, 79.3, 70.8, 60.3, 47.9, 34.7, 22.0, 11.9, 4.7}, //41.5
            {91.3, 85.9, 79.2, 70.7, 60.2, 47.9, 34.7, 22.0, 11.9, 4.7}, //41.4
            {91.1, 85.8, 79.1, 70.6, 60.1, 47.8, 34.7, 22.0, 11.9, 4.7}, //41.3
            {90.9, 85.6, 78.9, 70.5, 60.1, 47.8, 34.7, 22.0, 11.9, 4.7}, //41.2
            {90.7, 85.4, 78.8, 70.4, 60.0, 47.8, 34.6, 22.0, 11.9, 4.7}, //41.1
            {90.5, 85.3, 78.7, 70.3, 59.9, 47.8, 34.6, 22.0, 11.9, 4.7}, //41
            {90.3, 85.1, 78.5, 70.2, 59.9, 47.7, 34.6, 22.0, 11.9, 4.7}, //40.5
            {90.1, 84.9, 78.4, 70.1, 59.8, 47.7, 34.6, 22.0, 11.9, 4.7}, //40.4
            {89.9, 84.7, 78.2, 69.9, 59.7, 47.7, 34.6, 22.0, 11.9, 4.7}, //40.3
            {89.7, 84.6, 78.1, 69.8, 59.7, 47.6, 34.6, 22.0, 11.9, 4.7}, //40.2
            {89.5, 84.4, 77.9, 69.7, 59.6, 47.6, 34.6, 22.0, 11.9, 4.7}, //40.1
            {89.3, 84.2, 77.8, 69.6, 59.5, 47.6, 34.6, 22.0, 11.9, 4.7}, //40
            {89.1, 84.0, 77.7, 69.5, 59.5, 47.5, 34.6, 22.0, 11.9, 4.7}, //39.5
            {88.9, 83.9, 77.5, 69.4, 59.4, 47.5, 34.6, 22.0, 11.9, 4.7}, //39.4
            {88.6, 83.7, 77.4, 69.3, 59.3, 47.5, 34.6, 22.0, 11.9, 4.7}, //39.3
            {88.4, 83.5, 77.2, 69.2, 59.3, 47.4, 34.5, 22.0, 11.9, 4.7}, //39.2
            {88.2, 83.3, 77.1, 69.1, 59.2, 47.4, 34.5, 22.0, 11.9, 4.7}, //39.1
            {88.0, 83.1, 76.9, 69.0, 59.1, 47.4, 34.5, 22.0, 11.9, 4.7}, //39
            {87.8, 83.0, 76.8, 68.9, 59.0, 47.3, 34.5, 21.9, 11.9, 4.7}, //38.5
            {87.6, 82.8, 76.6, 68.7, 59.0, 47.3, 34.5, 21.9, 11.9, 4.7}, //38.4
            {87.4, 82.6, 76.5, 68.6, 58.9, 47.3, 34.5, 21.9, 11.9, 4.7}, //38.3
            {87.2, 82.4, 76.3, 68.5, 58.8, 47.2, 34.5, 21.9, 11.9, 4.7}, //38.2
            {87.0, 82.2, 76.2, 68.4, 58.8, 47.2, 34.5, 21.9, 11.9, 4.7}, //38.1
            {86.7, 82.0, 76.0, 68.3, 58.7, 47.1, 34.5, 21.9, 11.9, 4.7}, //38
            {86.5, 81.8, 75.8, 68.2, 58.6, 47.1, 34.4, 21.9, 11.9, 4.7}, //37.5
            {86.3, 81.6, 75.7, 68.0, 58.5, 47.1, 34.4, 21.9, 11.9, 4.7}, //37.4
            {86.1, 81.5, 75.5, 67.9, 58.4, 47.0, 34.4, 21.9, 11.9, 4.7}, //37.3
            {85.9, 81.3, 75.4, 67.8, 58.4, 47.0, 34.4, 21.9, 11.9, 4.7}, //37.2
            {85.6, 81.1, 75.2, 67.7, 58.3, 46.9, 34.4, 21.9, 11.9, 4.7}, //37.1
            {85.4, 80.9, 75.0, 67.6, 58.2, 46.9, 34.4, 21.9, 11.9, 4.7}, //37
            {85.2, 80.7, 74.9, 67.4, 58.1, 46.9, 34.4, 21.9, 11.9, 4.7}, //36.5
            {85.0, 80.5, 74.7, 67.3, 58.0, 46.8, 34.4, 21.9, 11.9, 4.7}, //36.4
            {84.8, 80.3, 74.6, 67.2, 58.0, 46.8, 34.3, 21.9, 11.9, 4.7}, //36.3
            {84.5, 80.1, 74.4, 67.1, 57.9, 46.7, 34.3, 21.9, 11.9, 4.7}, //36.2
            {84.3, 79.9, 74.2, 66.9, 57.8, 46.7, 34.3, 21.9, 11.9, 4.7}, //36.1
            {84.1, 79.7, 74.1, 66.8, 57.7, 46.6, 34.3, 21.9, 11.9, 4.7}, //36
            {83.8, 79.5, 73.9, 66.7, 57.6, 46.6, 34.3, 21.9, 11.9, 4.7}, //35.5
            {83.6, 79.3, 73.7, 66.6, 57.5, 46.6, 34.3, 21.9, 11.9, 4.7}, //35.4
            {83.4, 79.1, 73.6, 66.4, 57.4, 46.5, 34.3, 21.9, 11.9, 4.7}, //35.3
            {83.2, 78.9, 73.4, 66.3, 57.4, 46.5, 34.2, 21.9, 11.9, 4.7}, //35.2
            {82.9, 78.7, 73.2, 66.2, 57.3, 46.4, 34.2, 21.9, 11.9, 4.7}, //35.1
            {82.7, 78.5, 73.0, 66.0, 57.2, 46.4, 34.2, 21.9, 11.9, 4.7}, //35
            {82.5, 78.3, 72.9, 65.9, 57.1, 46.3, 34.2, 21.9, 11.9, 4.7}, //34.5
            {82.2, 78.0, 72.7, 65.8, 57.0, 46.3, 34.2, 21.9, 11.9, 4.7}, //34.4
            {82.0, 77.8, 72.5, 65.6, 56.9, 46.2, 34.2, 21.9, 11.9, 4.7}, //34.3
            {81.7, 77.6, 72.3, 65.5, 56.8, 46.2, 34.2, 21.9, 11.9, 4.7}, //34.2
            {81.5, 77.4, 72.2, 65.3, 56.7, 46.1, 34.1, 21.9, 11.9, 4.7}, //34.1
            {81.3, 77.2, 72.0, 65.2, 56.6, 46.1, 34.1, 21.9, 11.9, 4.7}, //34
            {81.0, 77.0, 71.8, 65.1, 56.5, 46.0, 34.1, 21.9, 11.9, 4.7}, //33.5
            {80.8, 76.8, 71.6, 64.9, 56.4, 46.0, 34.1, 21.9, 11.9, 4.7}, //33.4
            {80.5, 76.6, 71.4, 64.8, 56.3, 45.9, 34.1, 21.9, 11.9, 4.7}, //33.3
            {80.3, 76.3, 71.3, 64.6, 56.2, 45.9, 34.0, 21.9, 11.9, 4.7}, //33.2
            {80.0, 76.1, 71.1, 64.5, 56.1, 45.8, 34.0, 21.9, 11.9, 4.7}, //33.1
            {79.8, 75.9, 70.9, 64.4, 56.0, 45.8, 34.0, 21.9, 11.9, 4.7}, //33
            {79.5, 75.7, 70.7, 64.2, 55.9, 45.7, 34.0, 21.9, 11.9, 4.7}, //32.5
            {79.3, 75.5, 70.5, 64.1, 55.8, 45.7, 34.0, 21.9, 11.9, 4.7}, //32.4
            {79.0, 75.2, 70.3, 63.9, 55.7, 45.6, 33.9, 21.9, 11.9, 4.7}, //32.3
            {78.8, 75.0, 70.1, 63.8, 55.6, 45.5, 33.9, 21.9, 11.9, 4.7}, //32.2
            {78.5, 74.8, 69.9, 63.6, 55.5, 45.5, 33.9, 21.9, 11.9, 4.7}, //32.1
            {78.3, 74.6, 69.7, 63.5, 55.4, 45.4, 33.9, 21.9, 11.9, 4.7}, //32
            {78.0, 74.3, 69.6, 63.3, 55.3, 45.4, 33.9, 21.9, 11.9, 4.7}, //31.5
            {77.8, 74.1, 69.4, 63.2, 55.2, 45.3, 33.8, 21.9, 11.9, 4.7}, //31.4
            {77.5, 73.9, 69.2, 63.0, 55.1, 45.2, 33.8, 21.9, 11.9, 4.7}, //31.3
            {77.3, 73.6, 69.0, 62.8, 55.0, 45.2, 33.8, 21.9, 11.9, 4.7}, //31.2
            {77.0, 73.4, 68.8, 62.7, 54.9, 45.1, 33.8, 21.9, 11.9, 4.7}, //31.1
            {76.7, 73.2, 68.6, 62.5, 54.8, 45.1, 33.7, 21.9, 11.9, 4.7}, //31
            {76.5, 72.9, 68.4, 62.4, 54.7, 45.0, 33.7, 21.9, 11.9, 4.7}, //30.5
            {76.2, 72.7, 68.2, 62.2, 54.5, 44.9, 33.7, 21.9, 11.9, 4.7}, //30.4
            {75.9, 72.5, 68.0, 62.0, 54.4, 44.9, 33.7, 21.8, 11.9, 4.7}, //30.3
            {75.7, 72.2, 67.8, 61.9, 54.3, 44.8, 33.6, 21.8, 11.9, 4.7}, //30.2
            {75.4, 72.0, 67.6, 61.7, 54.2, 44.7, 33.6, 21.8, 11.9, 4.7}, //30.1
            {75.1, 71.8, 67.3, 61.6, 54.1, 44.7, 33.6, 21.8, 11.9, 4.7}, //30
            {74.9, 71.5, 67.1, 61.4, 54.0, 44.6, 33.6, 21.8, 11.9, 4.7}, //29.5
            {74.6, 71.3, 66.9, 61.2, 53.8, 44.5, 33.5, 21.8, 11.9, 4.7}, //29.4
            {74.3, 71.0, 66.7, 61.1, 53.7, 44.4, 33.5, 21.8, 11.9, 4.7}, //29.3
            {74.1, 70.8, 66.5, 60.9, 53.6, 44.4, 33.5, 21.8, 11.9, 4.7}, //29.2
            {73.8, 70.5, 66.3, 60.7, 53.5, 44.3, 33.5, 21.8, 11.9, 4.7}, //29.1
            {73.5, 70.3, 66.1, 60.5, 53.4, 44.2, 33.4, 21.8, 11.9, 4.7}, //29
            {73.2, 70.0, 65.9, 60.4, 53.2, 44.2, 33.4, 21.8, 11.9, 4.7}, //28.5
            {73.0, 69.8, 65.6, 60.2, 53.1, 44.1, 33.4, 21.8, 11.9, 4.7}, //28.4
            {72.7, 69.5, 65.4, 60.0, 53.0, 44.0, 33.3, 21.8, 11.9, 4.7}, //28.3
            {72.4, 69.3, 65.2, 59.8, 52.8, 43.9, 33.3, 21.8, 11.9, 4.7}, //28.2
            {72.1, 69.0, 65.0, 59.7, 52.7, 43.9, 33.3, 21.8, 11.9, 4.7}, //28.1
            {71.8, 68.8, 64.8, 59.5, 52.6, 43.8, 33.2, 21.8, 11.9, 4.7}, //28
            {71.5, 68.5, 64.5, 59.3, 52.4, 43.7, 33.2, 21.8, 11.9, 4.7}, //27.5
            {71.3, 68.2, 64.3, 59.1, 52.3, 43.6, 33.2, 21.8, 11.9, 4.7}, //27.4
            {71.0, 68.0, 64.1, 58.9, 52.2, 43.5, 33.1, 21.8, 11.9, 4.7}, //27.3
            {70.7, 67.7, 63.9, 58.7, 52.0, 43.4, 33.1, 21.8, 11.9, 4.7}, //27.2
            {70.4, 67.5, 63.6, 58.5, 51.9, 43.4, 33.1, 21.7, 11.9, 4.7}, //27.1
            {70.1, 67.2, 63.4, 58.4, 51.8, 43.3, 33.0, 21.7, 11.9, 4.7}, //27
            {69.8, 66.9, 63.2, 58.2, 51.6, 43.2, 33.0, 21.7, 11.9, 4.7}, //26.5
            {69.5, 66.7, 62.9, 58.0, 51.5, 43.1, 33.0, 21.7, 11.9, 4.7}, //26.4
            {69.2, 66.4, 62.7, 57.8, 51.3, 43.0, 32.9, 21.7, 11.9, 4.7}, //26.3
            {68.9, 66.1, 62.5, 57.6, 51.2, 42.9, 32.9, 21.7, 11.9, 4.7}, //26.2
            {68.6, 65.9, 62.2, 57.4, 51.1, 42.8, 32.8, 21.7, 11.9, 4.7}, //26.1
            {68.3, 65.6, 62.0, 57.2, 50.9, 42.8, 32.8, 21.7, 11.9, 4.7}, //26
            {68.0, 65.3, 61.7, 57.0, 50.8, 42.7, 32.8, 21.7, 11.9, 4.7}, //25.5
            {67.7, 65.0, 61.5, 56.8, 50.6, 42.6, 32.7, 21.7, 11.9, 4.7}, //25.4
            {67.4, 64.8, 61.3, 56.6, 50.5, 42.5, 32.7, 21.7, 11.9, 4.7}, //25.3
            {67.1, 64.5, 61.0, 56.4, 50.3, 42.4, 32.6, 21.7, 11.9, 4.7}, //25.2
            {66.8, 64.2, 60.8, 56.2, 50.2, 42.3, 32.6, 21.7, 11.9, 4.7}, //25.1
            {66.5, 63.9, 60.5, 56.0, 50.0, 42.2, 32.6, 21.6, 11.9, 4.7}, //25
            {66.2, 63.6, 60.3, 55.8, 49.8, 42.1, 32.5, 21.6, 11.9, 4.7}, //24.5
            {65.9, 63.3, 60.0, 55.6, 49.7, 42.0, 32.5, 21.6, 11.9, 4.7}, //24.4
            {65.6, 63.1, 59.8, 55.4, 49.5, 41.9, 32.4, 21.6, 11.9, 4.7}, //24.3
            {65.2, 62.8, 59.5, 55.2, 49.4, 41.8, 32.4, 21.6, 11.9, 4.7}, //24.2
            {64.9, 62.5, 59.3, 54.9, 49.2, 41.7, 32.3, 21.6, 11.9, 4.7}, //24.1
            {64.6, 62.2, 59.0, 54.7, 49.0, 41.6, 32.3, 21.6, 11.9, 4.7}, //24
            {64.3, 61.9, 58.7, 54.5, 48.9, 41.5, 32.2, 21.6, 11.9, 4.7}, //23.5
            {64.0, 61.6, 58.5, 54.3, 48.7, 41.4, 32.2, 21.6, 11.9, 4.7}, //23.4
            {63.7, 61.3, 58.2, 54.1, 48.5, 41.2, 32.1, 21.6, 11.9, 4.7}, //23.3
            {63.3, 61.0, 58.0, 53.8, 48.4, 41.1, 32.1, 21.5, 11.9, 4.7}, //23.2
            {63.0, 60.7, 57.7, 53.6, 48.2, 41.0, 32.0, 21.5, 11.9, 4.7}, //23.1
            {62.7, 60.4, 57.4, 53.4, 48.0, 40.9, 32.0, 21.5, 11.9, 4.7}, //23
            {62.4, 60.1, 57.2, 53.2, 47.9, 40.8, 31.9, 21.5, 11.9, 4.7}, //22.5
            {62.0, 59.8, 56.9, 52.9, 47.7, 40.7, 31.8, 21.5, 11.9, 4.7}, //22.4
            {61.7, 59.5, 56.6, 52.7, 47.5, 40.6, 31.8, 21.5, 11.9, 4.7}, //22.3
            {61.4, 59.2, 56.3, 52.5, 47.3, 40.4, 31.7, 21.5, 11.9, 4.7}, //22.2
            {61.0, 58.9, 56.1, 52.3, 47.1, 40.3, 31.7, 21.4, 11.9, 4.7}, //22.1
            {60.7, 58.6, 55.8, 52.0, 47.0, 40.2, 31.6, 21.4, 11.9, 4.7}, //22
            {60.4, 58.3, 55.5, 51.8, 46.8, 40.1, 31.5, 21.4, 11.9, 4.7}, //21.5
            {60.0, 58.0, 55.2, 51.5, 46.6, 40.0, 31.5, 21.4, 11.9, 4.7}, //21.4
            {59.7, 57.7, 55.0, 51.3, 46.4, 39.8, 31.4, 21.4, 11.9, 4.7}, //21.3
            {59.3, 57.3, 54.7, 51.1, 46.2, 39.7, 31.4, 21.4, 11.9, 4.7}, //21.2
            {59.0, 57.0, 54.4, 50.8, 46.0, 39.6, 31.3, 21.3, 11.9, 4.7}, //21.1
            {58.7, 56.7, 54.1, 50.6, 45.8, 39.4, 31.2, 21.3, 11.9, 4.7}, //21
            {58.3, 56.4, 53.8, 50.3, 45.6, 39.3, 31.1, 21.3, 11.9, 4.7}, //20.5
            {58.0, 56.1, 53.5, 50.1, 45.4, 39.2, 31.1, 21.3, 11.9, 4.7}, //20.4
            {57.6, 55.7, 53.2, 49.8, 45.2, 39.0, 31.0, 21.3, 11.9, 4.7}, //20.3
            {57.3, 55.4, 52.9, 49.6, 45.0, 38.9, 30.9, 21.2, 11.9, 4.7}, //20.2
            {56.9, 55.1, 52.6, 49.3, 44.8, 38.8, 30.9, 21.2, 11.9, 4.7}, //20.1
            {56.6, 54.8, 52.4, 49.1, 44.6, 38.6, 30.8, 21.2, 11.9, 4.7}, //20
            {56.2, 54.4, 52.1, 48.8, 44.4, 38.5, 30.7, 21.2, 11.9, 4.7}, //19.5
            {55.9, 54.1, 51.8, 48.6, 44.2, 38.3, 30.6, 21.2, 11.9, 4.7}, //19.4
            {55.5, 53.8, 51.5, 48.3, 44.0, 38.2, 30.6, 21.1, 11.9, 4.7}, //19.3
            {55.1, 53.4, 51.1, 48.0, 43.8, 38.0, 30.5, 21.1, 11.9, 4.7}, //19.2
            {54.8, 53.1, 50.8, 47.8, 43.6, 37.9, 30.4, 21.1, 11.9, 4.7}, //19.1
            {54.4, 52.8, 50.5, 47.5, 43.4, 37.7, 30.3, 21.1, 11.9, 4.7}, //19
            {54.1, 52.4, 50.2, 47.2, 43.2, 37.6, 30.2, 21.0, 11.9, 4.7}, //18.5
            {53.7, 52.1, 49.9, 47.0, 42.9, 37.4, 30.1, 21.0, 11.9, 4.7}, //18.4
            {53.3, 51.7, 49.6, 46.7, 42.7, 37.3, 30.0, 21.0, 11.9, 4.7}, //18.3
            {52.9, 51.4, 49.3, 46.4, 42.5, 37.1, 30.0, 21.0, 11.9, 4.7}, //18.2
            {52.6, 51.0, 49.0, 46.1, 42.3, 36.9, 29.9, 20.9, 11.9, 4.7}, //18.1
            {52.2, 50.7, 48.6, 45.9, 42.0, 36.8, 29.8, 20.9, 11.9, 4.7}, //18
            {51.8, 50.3, 48.3, 45.6, 41.8, 36.6, 29.7, 20.9, 11.9, 4.7}, //17.5
            {51.5, 50.0, 48.0, 45.3, 41.6, 36.4, 29.6, 20.8, 11.9, 4.7}, //17.4
            {51.1, 49.6, 47.7, 45.0, 41.3, 36.3, 29.5, 20.8, 11.9, 4.7}, //17.3
            {50.7, 49.3, 47.4, 44.7, 41.1, 36.1, 29.4, 20.8, 11.9, 4.7}, //17.2
            {50.3, 48.9, 47.0, 44.4, 40.9, 35.9, 29.3, 20.7, 11.9, 4.7}, //17.1
            {49.9, 48.5, 46.7, 44.1, 40.6, 35.8, 29.2, 20.7, 11.9, 4.7}, //17
            {49.5, 48.2, 46.4, 43.8, 40.4, 35.6, 29.1, 20.7, 11.9, 4.7}, //16.5
            {49.2, 47.8, 46.0, 43.6, 40.1, 35.4, 29.0, 20.6, 11.9, 4.7}, //16.4
            {48.8, 47.5, 45.7, 43.3, 39.9, 35.2, 28.9, 20.6, 11.9, 4.7}, //16.3
            {48.4, 47.1, 45.4, 43.0, 39.6, 35.0, 28.8, 20.5, 11.9, 4.7}, //16.2
            {48.0, 46.7, 45.0, 42.7, 39.4, 34.8, 28.6, 20.5, 11.8, 4.7}, //16.1
            {47.6, 46.3, 44.7, 42.3, 39.1, 34.7, 28.5, 20.5, 11.8, 4.7}, //16
            {47.2, 46.0, 44.3, 42.0, 38.9, 34.5, 28.4, 20.4, 11.8, 4.7}, //15.5
            {46.8, 45.6, 44.0, 41.7, 38.6, 34.3, 28.3, 20.4, 11.8, 4.7}, //15.4
            {46.4, 45.2, 43.6, 41.4, 38.4, 34.1, 28.2, 20.3, 11.8, 4.7}, //15.3
            {46.0, 44.8, 43.3, 41.1, 38.1, 33.9, 28.1, 20.3, 11.8, 4.7}, //15.2
            {45.6, 44.5, 42.9, 40.8, 37.8, 33.7, 27.9, 20.2, 11.8, 4.7}, //15.1
            {45.2, 44.1, 42.6, 40.5, 37.6, 33.5, 27.8, 20.2, 11.8, 4.7}, //15
            {44.8, 43.7, 42.2, 40.2, 37.3, 33.3, 27.7, 20.1, 11.8, 4.7}, //14.5
            {44.4, 43.3, 41.8, 39.8, 37.0, 33.1, 27.5, 20.1, 11.8, 4.7}, //14.4
            {44.0, 42.9, 41.5, 39.5, 36.8, 32.8, 27.4, 20.0, 11.8, 4.7}, //14.3
            {43.5, 42.5, 41.1, 39.2, 36.5, 32.6, 27.3, 20.0, 11.8, 4.7}, //14.2
            {43.1, 42.1, 40.8, 38.9, 36.2, 32.4, 27.1, 19.9, 11.8, 4.7}, //14.1
            {42.7, 41.7, 40.4, 38.5, 35.9, 32.2, 27.0, 19.9, 11.8, 4.7}, //14
            {42.3, 41.3, 40.0, 38.2, 35.6, 32.0, 26.9, 19.8, 11.8, 4.7}, //13.5
            {41.9, 40.9, 39.6, 37.9, 35.3, 31.8, 26.7, 19.7, 11.8, 4.7}, //13.4
            {41.5, 40.5, 39.3, 37.5, 35.0, 31.5, 26.6, 19.7, 11.7, 4.7}, //13.3
            {41.0, 40.1, 38.9, 37.2, 34.8, 31.3, 26.4, 19.6, 11.7, 4.7}, //13.2
            {40.6, 39.7, 38.5, 36.8, 34.5, 31.1, 26.3, 19.5, 11.7, 4.7}, //13.1
            {40.2, 39.3, 38.1, 36.5, 34.2, 30.8, 26.1, 19.5, 11.7, 4.7}, //13
            {39.8, 38.9, 37.7, 36.1, 33.9, 30.6, 25.9, 19.4, 11.7, 4.7}, //12.5
            {39.3, 38.5, 37.4, 35.8, 33.6, 30.4, 25.8, 19.3, 11.7, 4.7}, //12.4
            {38.9, 38.1, 37.0, 35.4, 33.2, 30.1, 25.6, 19.3, 11.7, 4.7}, //12.3
            {38.5, 37.7, 36.6, 35.1, 32.9, 29.9, 25.5, 19.2, 11.7, 4.7}, //12.2
            {38.0, 37.2, 36.2, 34.7, 32.6, 29.6, 25.3, 19.1, 11.6, 4.7}, //12.1
            {37.6, 36.8, 35.8, 34.3, 32.3, 29.4, 25.1, 19.0, 11.6, 4.7}, //12
            {37.1, 36.4, 35.4, 34.0, 32.0, 29.1, 24.9, 18.9, 11.6, 4.7}, //11.5
            {36.7, 36.0, 35.0, 33.6, 31.7, 28.8, 24.8, 18.9, 11.6, 4.7}, //11.4
            {36.2, 35.5, 34.6, 33.2, 31.3, 28.6, 24.6, 18.8, 11.6, 4.7}, //11.3
            {35.8, 35.1, 34.2, 32.9, 31.0, 28.3, 24.4, 18.7, 11.6, 4.7}, //11.2
            {35.3, 34.7, 33.8, 32.5, 30.7, 28.0, 24.2, 18.6, 11.5, 4.7}, //11.1
            {34.9, 34.2, 33.4, 32.1, 30.4, 27.8, 24.0, 18.5, 11.5, 4.7}, //11
            {34.4, 33.8, 32.9, 31.7, 30.0, 27.5, 23.8, 18.4, 11.5, 4.7}, //10.5
            {34.0, 33.4, 32.5, 31.4, 29.7, 27.2, 23.6, 18.3, 11.5, 4.7}, //10.4
            {33.5, 32.9, 32.1, 31.0, 29.3, 26.9, 23.4, 18.2, 11.5, 4.7}, //10.3
            {33.1, 32.5, 31.7, 30.6, 29.0, 26.6, 23.2, 18.1, 11.4, 4.7}, //10.2
            {32.6, 32.0, 31.3, 30.2, 28.6, 26.4, 23.0, 18.0, 11.4, 4.7}, //10.1
            {32.1, 31.6, 30.8, 29.8, 28.3, 26.1, 22.8, 17.9, 11.4, 4.7}, //10
            {31.7, 31.1, 30.4, 29.4, 27.9, 25.8, 22.6, 17.7, 11.4, 4.7}, //9.5
            {31.2, 30.7, 30.0, 29.0, 27.6, 25.5, 22.3, 17.6, 11.3, 4.7}, //9.4
            {30.7, 30.2, 29.6, 28.6, 27.2, 25.2, 22.1, 17.5, 11.3, 4.7}, //9.3
            {30.3, 29.8, 29.1, 28.2, 26.8, 24.9, 21.9, 17.4, 11.3, 4.7}, //9.2
            {29.8, 29.3, 28.7, 27.8, 26.5, 24.5, 21.7, 17.2, 11.2, 4.7}, //9.1
            {29.3, 28.9, 28.2, 27.4, 26.1, 24.2, 21.4, 17.1, 11.2, 4.7}, //9
            {28.8, 28.4, 27.8, 26.9, 25.7, 23.9, 21.2, 17.0, 11.1, 4.7}, //8.5
            {28.3, 27.9, 27.3, 26.5, 25.3, 23.6, 20.9, 16.8, 11.1, 4.7}, //8.4
            {27.9, 27.5, 26.9, 26.1, 25.0, 23.3, 20.7, 16.7, 11.1, 4.7}, //8.3
            {27.4, 27.0, 26.4, 25.7, 24.6, 22.9, 20.4, 16.5, 11.0, 4.7}, //8.2
            {26.9, 26.5, 26.0, 25.3, 24.2, 22.6, 20.2, 16.4, 11.0, 4.7}, //8.1
            {26.4, 26.0, 25.5, 24.8, 23.8, 22.3, 19.9, 16.2, 10.9, 4.7}, //8
            {25.9, 25.6, 25.1, 24.4, 23.4, 21.9, 19.6, 16.0, 10.9, 4.7}, //7.5
            {25.4, 25.1, 24.6, 24.0, 23.0, 21.6, 19.4, 15.9, 10.8, 4.7}, //7.4
            {24.9, 24.6, 24.1, 23.5, 22.6, 21.2, 19.1, 15.7, 10.7, 4.7}, //7.3
            {24.4, 24.1, 23.7, 23.1, 22.2, 20.9, 18.8, 15.5, 10.7, 4.7}, //7.2
            {23.9, 23.6, 23.2, 22.6, 21.8, 20.5, 18.5, 15.3, 10.6, 4.7}, //7.1
            {23.4, 23.1, 22.7, 22.2, 21.4, 20.1, 18.2, 15.2, 10.5, 4.7}, //7
            {22.9, 22.6, 22.3, 21.7, 20.9, 19.8, 17.9, 15.0, 10.5, 4.7}, //6.5
            {22.4, 22.1, 21.8, 21.3, 20.5, 19.4, 17.6, 14.8, 10.4, 4.7}, //6.4
            {21.9, 21.6, 21.3, 20.8, 20.1, 19.0, 17.3, 14.6, 10.3, 4.7}, //6.3
            {21.4, 21.1, 20.8, 20.3, 19.7, 18.6, 17.0, 14.4, 10.2, 4.7}, //6.2
            {20.8, 20.6, 20.3, 19.9, 19.2, 18.2, 16.7, 14.1, 10.1, 4.7}, //6.1
            {20.3, 20.1, 19.8, 19.4, 18.8, 17.8, 16.4, 13.9, 10.1, 4.6}, //6
            {19.8, 19.6, 19.3, 18.9, 18.3, 17.4, 16.0, 13.7, 10.0, 4.6}, //5.5
            {19.3, 19.1, 18.8, 18.5, 17.9, 17.0, 15.7, 13.5, 9.8, 4.6}, //5.4
            {18.8, 18.6, 18.3, 18.0, 17.4, 16.6, 15.4, 13.2, 9.7, 4.6}, //5.3
            {18.2, 18.1, 17.8, 17.5, 17.0, 16.2, 15.0, 13.0, 9.6, 4.6}, //5.2
            {17.7, 17.5, 17.3, 17.0, 16.5, 15.8, 14.7, 12.7, 9.5, 4.6}, //5.1
            {17.2, 17.0, 16.8, 16.5, 16.1, 15.4, 14.3, 12.5, 9.4, 4.6}, //5
            {16.6, 16.5, 16.3, 16.0, 15.6, 15.0, 13.9, 12.2, 9.2, 4.6}, //4.5
            {16.1, 16.0, 15.8, 15.5, 15.1, 14.5, 13.6, 11.9, 9.1, 4.6}, //4.4
            {15.6, 15.4, 15.3, 15.0, 14.7, 14.1, 13.2, 11.6, 8.9, 4.6}, //4.3
            {15.0, 14.9, 14.7, 14.5, 14.2, 13.6, 12.8, 11.3, 8.8, 4.5}, //4.2
            {14.5, 14.4, 14.2, 14.0, 13.7, 13.2, 12.4, 11.0, 8.6, 4.5}, //4.1
            {13.9, 13.8, 13.7, 13.5, 13.2, 12.7, 12.0, 10.7, 8.4, 4.5}, //4
            {13.4, 13.3, 13.2, 13.0, 12.7, 12.3, 11.6, 10.4, 8.3, 4.5}, //3.5
            {12.8, 12.7, 12.6, 12.5, 12.2, 11.8, 11.2, 10.1, 8.1, 4.4}, //3.4
            {12.3, 12.2, 12.1, 11.9, 11.7, 11.3, 10.8, 9.7, 7.9, 4.4}, //3.3
            {11.7, 11.6, 11.5, 11.4, 11.2, 10.9, 10.3, 9.4, 7.7, 4.3}, //3.2
            {11.1, 11.1, 11.0, 10.9, 10.7, 10.4, 9.9, 9.0, 7.4, 4.3}, //3.1
            {10.6, 10.5, 10.4, 10.3, 10.2, 9.9, 9.5, 8.7, 7.2, 4.2}, //3
            {10.0, 10.0, 9.9, 9.8, 9.6, 9.4, 9.0, 8.3, 6.9, 4.2}, //2.5
            {9.4, 9.4, 9.3, 9.3, 9.1, 8.9, 8.5, 7.9, 6.7, 4.1}, //2.4
            {8.9, 8.8, 8.8, 8.7, 8.6, 8.4, 8.1, 7.5, 6.4, 4.0}, //2.3
            {8.3, 8.3, 8.2, 8.2, 8.0, 7.9, 7.6, 7.1, 6.1, 3.9}, //2.2
            {7.7, 7.7, 7.7, 7.6, 7.5, 7.4, 7.1, 6.7, 5.8, 3.8}, //2.1
            {7.2, 7.1, 7.1, 7.0, 7.0, 6.8, 6.6, 6.2, 5.5, 3.7}, //2
            {6.6, 6.5, 6.5, 6.5, 6.4, 6.3, 6.1, 5.8, 5.1, 3.6}, //1.5
            {6.0, 6.0, 5.9, 5.9, 5.9, 5.8, 5.6, 5.3, 4.8, 3.4}, //1.4
            {5.4, 5.4, 5.4, 5.3, 5.3, 5.2, 5.1, 4.9, 4.4, 3.2}, //1.3
            {4.8, 4.8, 4.8, 4.8, 4.7, 4.7, 4.6, 4.4, 4.0, 3.0}, //1.2
            {4.2, 4.2, 4.2, 4.2, 4.2, 4.1, 4.0, 3.9, 3.6, 2.8}, //1.1
            {3.6, 3.6, 3.6, 3.6, 3.6, 3.5, 3.5, 3.4, 3.2, 2.5}, //1
            {3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 2.9, 2.9, 2.7, 2.2}, //0.5
            {2.4, 2.4, 2.4, 2.4, 2.4, 2.4, 2.4, 2.3, 2.2, 1.9}, //0.4
            {1.8, 1.8, 1.8, 1.8, 1.8, 1.8, 1.8, 1.8, 1.7, 1.5}, //0.3
            {1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.1}, //0.2
            {0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 0.6}, //0.1
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0} //0
    };*/
}