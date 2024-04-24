import java.util.Scanner;








public class FactorialMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int num= sc.nextInt();
        FactorialMain factorialNumber= new  FactorialMain();
        int Result= factorialNumber.factorial(num);
        System.out.println( " the Factorial Number is : " +Result);
    }

    int factorial(int n)
    {
        int fact= 1;
        for(int seq= 1; seq<=n; seq++)
        {
            fact*=seq;
        }
        return fact;
    }




}
