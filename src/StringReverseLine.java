import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverseLine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" enter the text :  ");
        String text= scanner.nextLine();
        String revText = reverseString(text);
        System.out.println(text);
        System.out.println(revText);


    }

    static String reverseString(String text)
    {
        String[] words= text.split(" ");
        String revString = " ";
        for(String word: words) {
            StringBuilder stringBuilder = new StringBuilder(word);
            revString = revString + stringBuilder.reverse() + " ";
        }
            return revString;
    }
}
