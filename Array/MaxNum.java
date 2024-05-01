
// Find the maximum element in the given array
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arrN = new int[n];

        // take array elements as a input:
        System.out.println("Input" + n + "Array Elements:");
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = scn.nextInt();
        }

        // find max element
        int max = 0;
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] > max) {
                max = arrN[i];
            }
        }
        System.out.println("Maximum Number in a Array is:" + max);
    }
}
