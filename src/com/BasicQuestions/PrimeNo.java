package com.BasicQuestions;

import java.util.ArrayList;

public class PrimeNo {
    private static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int n) {
        if(n<=1) return false;
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int nthPRimeNo(int n){
        int count=30;
        ArrayList<Integer> primes= new ArrayList<>();
        primes.add(2);
        while(count-->0){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i!=0){
                primes.add(count);
            }
            count++;
        }
    }
        int res=primes.get(n);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(71));
        boolean res = isPrime1(0);
        System.out.println(res);
        System.out.println(nthPRimeNo(19));
    }
}
