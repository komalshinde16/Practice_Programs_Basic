package com.itshaala.code;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 9;
        boolean isPrime = false;

        if(num<=1 ) isPrime = true;

        for(int i =2; i<= num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number it is");
        }else {
            System.out.println("not a prime number");
        }
    }
}
