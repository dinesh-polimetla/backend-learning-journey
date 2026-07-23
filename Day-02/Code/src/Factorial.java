import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        int result = getFactorial(n);
        if(n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("The factorial of " + n + " : " + result);
        }
        scanner.close();
    }
    public static int getFactorial(int n){
        int result = 1;
        for(int i = n;i>0;i--){
            result *= i;
        }
        return result;
    }
}
