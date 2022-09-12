package com.BasicQuestions;

// find min and max element in an array
public class minMax {
    public static void main(String[] args) {
        int arr[] = {3,5,4,9,7,1};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(max<arr[i]) max=arr[i];
        }
        System.out.println(min+" "+max);

    }
}
