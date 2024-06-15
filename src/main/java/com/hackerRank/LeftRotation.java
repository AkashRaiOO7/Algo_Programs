package com.hackerRank;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        System.out.println(rotLeft(Arrays.asList(1,2,3,4,5), 2004));
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        d=d%a.size();
        int n=a.size();
        reverse(a, 0, d-1);
        reverse(a, d, n-1);
        reverse(a, 0, n-1);
        return a;
    }

    private static void reverse(List<Integer> a, int i, int j) {
        int start= i;
        int end= j;
        while (start<end){
            int temp= a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
    }

    public static List<Integer> rotLeftBruteForce(List<Integer> a, int d) {
        int i=1;
        d=d%a.size();
        System.out.println("d="+d);
        while(i<=d){
            int temp=a.get(0);
            for(int j=0; j<a.size()-1; j++){
                a.set(j, a.get(j+1));
            }
            a.set(a.size()-1, temp);
            i++;
        }
        return a;
    }
}
