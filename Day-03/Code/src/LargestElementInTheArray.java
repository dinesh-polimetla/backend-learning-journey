import java.util.Scanner;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  readArray(size,scanner);

        int largestElement = findLargest(arr);
        System.out.print("The largest element in the array : " + largestElement);

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
