package com.itshaala.code;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a =90;
        int b=89;
        int temp;

        System.out.println("before swapping:");
        System.out.println(a);
        System.out.println(b);

        temp = a;
        a=b;
        b = temp;

        System.out.println("after swapping:");
        System.out.println(a);
        System.out.println(b);

    }
}
