import java.util.Scanner;

public class ReadAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  readArray(size,scanner);
        printArray(arr);
        scanner.close();
    }

    public static int[] readArray(int size, Scanner scanner){
        int[] arr = new int[size];

        for(int i = 0; i<arr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("The Elements in the array are: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
