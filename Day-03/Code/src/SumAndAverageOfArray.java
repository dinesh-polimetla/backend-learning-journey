import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr =  readArray(size,scanner);

        int sum = sumOfArray(arr);
        System.out.println("The sum of elements in the array : " + sum);

        double average = averageOfArray(sum,size);
        System.out.println("The average of array: " + average);

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

    public static int sumOfArray(int[] arr) {
        int sum = 0;

        for(int element : arr) {
            sum += element;
        }

        return sum;
    }

    public static double averageOfArray(int sum, int size) {
        return (double) sum / size;
    }
}
