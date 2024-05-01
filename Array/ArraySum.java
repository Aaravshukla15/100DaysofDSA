// Write a programme to perform sum of an Array

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        // sum of all the array elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of all the array elements is:" + sum);
    }
}
