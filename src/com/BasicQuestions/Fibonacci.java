package com.BasicQuestions;

public class Fibonacci {

    protected static void fibCount(int n){
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println();
        System.out.println(a);
    }
    protected static void fibSeries(int n){
        int a=0,b=1;
        if(n==a) System.out.print(a); 
        else if(n==b) System.out.print(a+" "+b);

        else{
            for(int i=1;i<=n;i++){
                System.out.print(a+" ");
                int temp=a+b;
                a=b;
                b=temp;
            }
        }
    }
    public static void main(String[] args) {
        fibSeries(9);
        fibCount(9);
    }
}
