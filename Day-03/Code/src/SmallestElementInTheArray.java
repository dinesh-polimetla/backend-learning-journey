import java.util.Scanner;

public class SmallestElementInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  readArray(size,scanner);

        int smallestElement = findSmallest(arr);
        System.out.print("The Smallest element in the array : " + smallestElement);

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

    public static int findSmallest(int[] arr) {
        int smallest = arr[0];

        for(int i = 1; i<arr.length ; i++){
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
