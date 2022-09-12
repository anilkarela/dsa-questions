package com.BasicQuestions;

public class Factorial {
    protected static void fact(int n){
        double res=1;
        for(int i=1;i<n;i++){
            res=res+res*i;
        }
        System.out.println(res);
    }
    protected static int fact_rec(int n){
        if(n==1 || n==0) return 1;
        else return n*fact_rec(n-1);
    }
    public static void main(String[] args) {
        fact(50);
        int res=fact_rec(6);
        System.out.println(res);
    }
}
