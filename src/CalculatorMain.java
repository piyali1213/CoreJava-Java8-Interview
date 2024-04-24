import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the First number: ");
           int no1= scanner.nextInt();
        System.out.println("enter the Second number: ");
        int no2= scanner.nextInt();

        Calculator calculator= new Calculator(no1, no2);
        System.out.println("Addition :" +calculator.add());
        System.out.println("Substruction :" +calculator.sub());
        System.out.println("Division :" +calculator.div());
        System.out.println("Multiplication :" +calculator.mul());

    }
}
