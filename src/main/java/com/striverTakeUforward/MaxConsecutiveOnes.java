package com.striverTakeUforward;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        //reference https://www.youtube.com/watch?t=1124&v=bYWLJb3vCWY&feature=youtu.be
        //https://leetcode.com/problems/max-consecutive-ones/solutions/5322502/java-solution-for-max-consecutive-ones-in-2ms/
        int maxConsecutiveOnes= maxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1});
        System.out.println("maxConsecutiveOnes: "+ maxConsecutiveOnes);
    }
    public static int maxConsecutiveOnes(int[] arr){
        int maxConsecutive=0;
        int consecutive=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==1){
                consecutive++;
                if(consecutive>maxConsecutive){
                    maxConsecutive=consecutive;
                }
            }else{
                consecutive=0;
            }
        }
        return maxConsecutive;
    }
}
