package javaCoadingInterview;

public class ReverseArrayWithLoop {

    public static void reverseArr(int [] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
        public static void printArr(int [] arr, int size)
        {
            for(int i=0;i<size;i++)

            {
                System.out.println(i);
            }
        }

    public static void main(String[] args) {
        int [] originalArr= { 4,6,1,8,0};
        printArr(originalArr,5);
        reverseArr( originalArr,0,4);
    }


}