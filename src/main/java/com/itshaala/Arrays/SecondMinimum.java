package com.itshaala.Arrays;

public class SecondMinimum {
    public static void main(String[] args) {

        int [ ] array = {12,87,56,96,32,4,8755,44};

        int min = array[0];
        int secondMin = array[0];


        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
        }
        System.out.println(secondMin);


    }
}
