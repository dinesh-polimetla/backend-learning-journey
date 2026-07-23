import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        int result = reverseNumber(n);
        // Using an advanced Switch statement to check whether the number is negative , positive or zero.
        switch(result){
            case -1 -> System.out.println("Please Enter a positive Number");
            case 0  -> System.out.println("The number after reversing: " + 0);
            default -> System.out.println("The number after reversing: " + result);
        }
        scanner.close();
    }
    // Reverses the digits of a non-negative integer.
    public static int reverseNumber(int n) {
        int reverse = 0 ;
        if(n < 0){
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        while(n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }
}
