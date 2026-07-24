package arrays;

import utils.ArrayUtils;
import java.util.Scanner;

public class ReadAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  ArrayUtils.readArray(size,scanner);
        printArray(arr);
        scanner.close();
    }

    public static void printArray(int[] arr) {
        System.out.println("The Elements in the array are: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
