package com.itshaala.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int max = 0;

        for(int i=0; i< array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
        }

        System.out.println("max element is : " +max);
    }
}
