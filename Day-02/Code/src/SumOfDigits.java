import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("Please enter a non-negative number");
        } else {
            System.out.println("The sum of digits of " + n + " : " + sumOfTheDigits(n));
        }
        scanner.close();
    }
    public static int sumOfTheDigits(int n) {
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
