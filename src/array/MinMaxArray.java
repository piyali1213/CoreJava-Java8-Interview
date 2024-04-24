package array;

public class MinMaxArray {
    public static int getMin(int arr[], int n)
    {
        int dig= arr[0];
        for(int i=0;i<n;i++)

            dig= Math.min(dig,arr[i]);
        return dig;
    }

    public static int getMax(int arr[], int n)
    {
        int dig= arr[0];
        for (int i=0; i<n;i++)
            dig= Math.max(dig,arr[i]);
                    return dig;

    }

    public static void main(String[] args) {
        int arr[]= {23,56,12,78,4,67};
        int n= arr.length;
        System.out.println("The minimun element of the array: " + getMin(arr,n) );
        System.out.println("The maximun element of the array: " + getMax(arr,n) );

    }

    }
