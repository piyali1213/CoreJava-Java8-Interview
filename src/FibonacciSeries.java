import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the series: ");
        int num= sc.nextInt();
        displayFibonacci(num);
       // sc.close();


    }

    static void displayFibonacci(int n) {
        int x = 1, y = 0, z = 0, count = 1;
        while (count <= n) {
            System.out.println(z + " ");
            z = x + y;
            x = y;
            y = z;
            count++;
        }
    }

}
