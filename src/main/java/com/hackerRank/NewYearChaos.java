package com.hackerRank;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> q = Arrays.asList(1, 2, 5, 3, 4, 7, 8, 6);
        minimumBribes(q);
    }
    public static void minimumBribes(List<Integer> q){
        int swap=0;
        for(int i=q.size()-1; i>= 0; i--){
            if(q.get(i) != i+1){
                if((i-1)>=0 && (q.get(i-1) == i+1)){
                    int temp=q.get(i-1);
                    q.set(i-1, q.get(i));
                    q.set(i, temp);
                    swap++;
                }else if ((i-2>=0) && (q.get(i-2) ==i+1)) {
                    int temp= q.get(i-2);
                    q.set(i-2, q.get(i-1));
                    q.set(i-1, q.get(i));
                    q.set(i, temp);
                    swap+=2;
                }else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swap);
    }
    public static void minimumBribesBruteForce(List<Integer> q) {
        int swap;
        int noOfBribe=0;
        for (int i = 0; i < q.size()-1; i++) {
            swap=0;
            for (int j = i+1; j < q.size(); j++) {
                if (q.get(i) > q.get(j)) {
                    swap++;
                    if (swap > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
            noOfBribe= noOfBribe+swap;
        }
        System.out.println(noOfBribe);
    }
}
