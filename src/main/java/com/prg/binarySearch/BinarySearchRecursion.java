package com.prg.binarySearch;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 17, 89};
        int index = repeatMe(arr, 0, 4, 12);
        System.out.format("index: %s", index);
    }

    public static int repeatMe(int[] arr, int start, int end, int key) {
        /**
         * Mistake I did while writing this code
         * 1) Wrote the entire logic in while loop
         * 2) was missing return statement while calling iterative method
         */
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return repeatMe(arr, mid + 1, end, key);
        return repeatMe(arr, start, mid - 1, key);
    }
}
