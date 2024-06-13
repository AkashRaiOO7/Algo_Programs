package com.hackerRank;

public class MinSwap {
    //Reference: https://www.youtube.com/watch?v=mmQyxyHoR5Y&ab_channel=BrianDyck
    static int minimumSwaps(int[] arr) {
        int index=0;
        int count=0;
        while(index != arr.length-1){
            if(arr[index] != index+1){
                swap(index, arr[index]-1, arr);
                count++;
            }else{
                index++;
            }
        }
        return count;
    }
    static void swap(int i, int j, int[] arr){
        int temp= arr[j];
        arr[j]= arr[i];
        arr[i]= temp;
    }

    public static void main(String[] args) {
        int count= minimumSwaps(new int[]{7,6,4,1,2,5,3});
        System.out.println(count);
    }
}

