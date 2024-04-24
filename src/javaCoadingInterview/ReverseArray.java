//package javaCoadingInterview;
//
//public class ReverseArray {
//    public static void reverseArray( int [] Arr) {
//        int[] reverseArray = new int[Arr.length];
//        for (int i = 0; i < Arr.length; i++) {
//            reverseArray[i] = Arr[Arr.length - i - 1];
//        }
//
//        //ReverseArray
//        System.out.println(" Reverse Array");
//        for (int i : reverseArray) {
//            System.out.println(i);
//        }
//
//    }
//    public static void main(String[] args) {
//        int [] originalArray = { 5,7,1,9,6,0};
//        for(int i : originalArray) {
//            System.out.println(i);
//        }
//      //  System.out.println(originalArray);
//        reverseArray(originalArray);
//    }
//}
package javaCoadingInterview;
public class ReverseArray {
    public static  void reverseArr(int []arr) {
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            reverseArray[i] = arr[arr.length - i - 1];
    }

        System.out.println( "reverseArray : ");
        for (int i:reverseArray)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int [] originalArr= {2,3,4,7,3,4};
        System.out.println(" originalArray: ");
        for(int i: originalArr){
            System.out.println( i);
        }
        reverseArr(originalArr);


    }


}




























