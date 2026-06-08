package com.itshaala.Arrays;

public class CountEvenOddInAnArray {
    public static void main(String[] args) {

        int[] array = {10, 15, 20, 25, 30, 35, 40};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
    }
}
