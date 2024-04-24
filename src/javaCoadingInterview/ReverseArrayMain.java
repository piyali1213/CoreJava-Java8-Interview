package javaCoadingInterview;

import java.util.Arrays;

public class ReverseArrayMain {
    public static void main(String[] args) {
        int [] originalArr= { 2,4,6,7,2,9};
        int [] reverseArr= new int[originalArr.length];

        for(int i=0; i<originalArr.length; i++)
        {
         reverseArr[i]= originalArr[originalArr.length-i-1];
        }
        System.out.println(Arrays.toString (reverseArr));
    }
}

