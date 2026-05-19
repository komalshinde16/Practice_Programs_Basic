package com.itshaala.code;

public class Largestof3Numbers {

    public static void main(String[] args) {
        int a = 8;
        int b = 777;
        int c = 98;

        if(a > b && a > c){
            System.out.println("a is largest num");
        } else if (b > a && b > c) {
            System.out.println("b is largest num");

        }else{
            System.out.println("c is largest number");
        }
    }
}
