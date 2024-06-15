package com.prg.selectionSort;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int arr[]= new int[]{51,2,30,4,6};
        System.out.println(Arrays.toString(selectionSort(arr, 0, arr.length)));

    }
    static int[] selectionSort(int[] arr, int start, int end){
        int min_index;
        for(int i=0; i<end-1; i++){
            min_index=i;
            for(int j=i+1; j<end; j++) {
                if(arr[min_index]>arr[j]){
                    min_index=j;  //2
                }
            }
            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]= temp;
        }
        return arr;
    }
}
