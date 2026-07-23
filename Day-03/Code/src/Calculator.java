import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number n1: ");
        int n1 =  scanner.nextInt();
        System.out.print("Enter number n2: ");
        int n2 =  scanner.nextInt();

        System.out.println("The sum of two numbers is : " + addNums(n1,n2));
        System.out.println("The difference between two numbers is : " + subtract(n1,n2));
        System.out.println("The product of two numbers is : " + multiply(n1,n2));
        System.out.println("The division of two numbers is : " + divide(n1,n2));
        scanner.close();
    }
    public static int addNums(int a, int b) {
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
