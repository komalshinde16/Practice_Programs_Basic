package com.itshaala.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int [] array1= {1,2,3};
        int [] array2 = {4,5,6};

        int[] merged = new int[array1.length + array2.length];

        for(int i=0; i< array1.length; i++){
            merged[i] = array1[i];
        }
        for(int i=0; i<array2.length; i++){
            merged[array1.length+i] = array2[i];
        }



    }
}
