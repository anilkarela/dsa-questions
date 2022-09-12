package com.BasicQuestions;

public class Palindrome {

    public static boolean isPalindrome(int n) {
        int temp=n;
        int res=0;
        while(temp>0){
            int rem=temp%10;
            res=res*10+rem;
            temp/=10;
        }
        if(res==n) return true;
        return false;

    }

    public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    }
}
