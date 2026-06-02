package com.itshaala.Arrays;

public class Sum02 {
    public static void main(String[] args) {
        int [] array = {1,2,3,32,1,24};
        int sum = 0;

        for(int i=0; i< array.length; i++){
            sum = sum + array[i];

        }
        System.out.println("sum of the elements present in the array is : " +sum);
    }
}
