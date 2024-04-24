package javaCoadingInterview;

import java.util.Arrays;

public class MinMaxArray {
    public int min;
    public int max;
}

class ArrayM {
    static MinMaxArray minMax(int[] arr, int n) {
        MinMaxArray minMaxArray = new MinMaxArray();
        Arrays.sort(arr);
        minMaxArray.min = arr[0];
        minMaxArray.max = arr[n - 1];
        return minMaxArray;
    }


    public static void main(String[] args) {
        int []originalArr= {39,58,17,100,79,42};
        int Array_size= originalArr.length;
        MinMaxArray minMaxArray= minMax(originalArr,Array_size);
        System.out.println("minimum:" +minMaxArray.min);
        System.out.println("maximam :" +minMaxArray.max);



    }
}