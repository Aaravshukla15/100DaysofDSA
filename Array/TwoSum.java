// Given array of N elements, check there if exists a pair(i,j),such that arr[i]+ arr[j]==k and i!=j.
// Where i and j are given value and k is sum.

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 0, 3, 1, 5, 7 };
        int k = 8;
        System.out.println("Given Array is: " + Arrays.toString(arr));
        int[] result = twoSum(arr, k);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }

    public static int[] twoSum(int[] arr, int eleSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == eleSum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
