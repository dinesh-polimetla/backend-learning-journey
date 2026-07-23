import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome");
        }else {
            System.out.println(n + " is not a palindrome");
        }

        scanner.close();
    }
    // Method to check whether a number is palindrome or not
    public static boolean isPalindrome(int n) {
        // Negative numbers are not palindromes
        if( n < 0) {
            return false;
        }
        int reverse = 0;
        int num = n;
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse == n;
    }
}
