package com.itshaala.Arrays;

public class AverageofArrray {
    public static void main(String[] args) {

        int [] array = {10,10,10,10,10,10,36};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Average = " + average);

    }
}
