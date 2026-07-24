package arrays;

import utils.ArrayUtils;
import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = scanner.nextInt();

        int[] arr = ArrayUtils.readArray(size,scanner);

        System.out.println("Original Array: ");
        ArrayUtils.printArray(arr);

        System.out.println();

        int evenNumbers = countEven(arr);
        System.out.println("Number of even numbers in array: " + evenNumbers);

        int oddNumbers = countOdd(arr);
        System.out.println("Number of odd numbers in array: " + oddNumbers);

        scanner.close();
    }
    public static int countEven(int[] arr) {
        int evenCount = 0;

        for(int element : arr) {
            if(element % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
    public static int countOdd(int[] arr) {
        int oddCount = 0;

        for(int element : arr) {
            if(element % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }
}
