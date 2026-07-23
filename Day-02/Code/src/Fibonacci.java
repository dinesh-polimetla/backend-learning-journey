import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        if(n < 0) {
            System.out.println("Please enter a non-negative number");
        } else if (n == 0) {
            System.out.println("No terms to display");
        } else if (n == 1) {
            System.out.println(0);
        } else {
            printFibonacciSeries(n);
        }
        scanner.close();
    }
    public static void printFibonacciSeries(int n) {
        int before = 0;
        int current = 1;
        int sum = 0;
        System.out.print(before + " ");
        System.out.print(current + " ");
        for(int i = 2; i < n;i++){
            sum = before + current;
            System.out.print(sum + " ");
            before = current;
            current = sum;
        }
    }
}
