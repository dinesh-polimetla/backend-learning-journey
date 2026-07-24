package arrays;

import utils.ArrayUtils;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = ArrayUtils.readArray(size,scanner);

        System.out.println("Original Array: ");
        ArrayUtils.printArray(arr);

        System.out.println();

        System.out.println("Array after reversing: ");
        int[] reversedArray = reverseArray(arr);
        ArrayUtils.printArray(reversedArray);

        scanner.close();
    }
    public static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        int startingIndex = 0;

        for(int i = arr.length-1 ; i >= 0; i--) {
            newArray[startingIndex] = arr[i];
            startingIndex++;
        }

        return newArray;
    }
}
