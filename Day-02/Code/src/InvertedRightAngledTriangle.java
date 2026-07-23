import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        if(rows < 0){
            System.out.println("Please enter a valid number!");
        }else{
            printPattern(rows);
        }
        scanner.close();
    }
    public static void printPattern(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
