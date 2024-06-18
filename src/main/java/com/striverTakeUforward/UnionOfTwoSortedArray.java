package com.striverTakeUforward;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]= {2,4,7,8,13,15,19};
        int arr2[]= {7, 8, 10,15,20,99};
        hashSet(arr1, arr2);
    }
    public static void hashSet(int[] arr1, int arr2[]){
        Set<Integer> unionSet= new TreeSet<>();
        for(int i=0; i<arr1.length; i++){
            unionSet.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            unionSet.add(arr1[i]);
        }
        System.out.println(unionSet);
    }
}
