package com.prg.binarySearch;

/**
 *Binary search is a searching algorithm used in a sorted array
 *by repeatedly dividing the search interval in half.
 */
public class BinarySearchIteratively {
    public static void main(String[] args) {
        int[] arr = {10,12,13,17,89};
        System.out.print("Enter the key to search: ");
        int key= 12;
        int index= binarySearchAlgo(arr, key);
        System.out.println("element index:  "+index);
    }
    private static int binarySearchAlgo(int[] arr, int key) {
        int start, end, mid;
        start=0;end= arr.length-1;
        while(start<=end){
            mid=(start+end)/2;
            System.out.format("value of start %s value of end %s value of mid %s\n", start, end, mid);
            if(key==arr[mid]){
                return mid;
            }else if(key>arr[mid]){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
}