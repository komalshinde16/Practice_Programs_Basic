package com.itshaala.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {

        int [] array = {1,2,3,32,1,24};

        int max = array[0];
        int secondMax = array[0];



        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
    }
}
