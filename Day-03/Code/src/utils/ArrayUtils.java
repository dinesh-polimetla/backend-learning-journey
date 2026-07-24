package utils;

import java.util.Scanner;

public class ArrayUtils {

    public static int[] readArray(int size, Scanner scanner) {

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element " + (i+1) + ": ");

            arr[i]=scanner.nextInt();

        }

        return arr;
    }

}