package arrays;

import utils.ArrayUtils;
import java.util.Scanner;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  ArrayUtils.readArray(size,scanner);

        int largestElement = findLargest(arr);
        System.out.print("The largest element in the array : " + largestElement);

        scanner.close();
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for(int i = 1; i<arr.length ; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
