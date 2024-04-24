import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string: ");
        String word =sc.next();
        if(isPalindrome(word))
            System.out.println(" its palindrome");
        else
            System.out.println("its not palindrome");


    }
    static boolean isPalindrome(String word) {

        int forwardIndex = 0, backwardIndex = word.length() - 1;
        while (forwardIndex <= backwardIndex) {

            char startChar= word.charAt(forwardIndex);
            char endChar= word.charAt(backwardIndex);
            if(startChar!=endChar)
                return false;
            forwardIndex++;
            backwardIndex--;

        }
return true;
    }
}

