package com.prg.bubbleSort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int arr[]= new int[]{6,4,1};
        System.out.println(Arrays.toString(bubbleSort(arr, 0, arr.length)));

    }
    static int[] bubbleSort(int[] arr, int start, int end){
        int swap=0;
        for(int i=0; i<end-1; i++){
            for(int j=0; j<end-1; j++){
                if(arr[j]>arr[j+1]){
                    swap++;
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("no. of swap: "+ swap);
        return arr;
    }
}
