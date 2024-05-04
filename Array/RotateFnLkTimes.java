//Given array of N integers, Rotate the given arrays from last to first by K times

public class RotateFnLkTimes {
    public static void main(String[] args) {
        int[] arr = { 15, 20, 54, 9, 102, 212, 66, 55 };
        int kTimes = 22;
        System.out.println("Orignal Arrays is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed Arrays is:");
        rotateArray(arr, kTimes);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle cases where k is greater than array length

         d = d % n;
        
        // Reverse the first d elements (if d > 0)
       reverse(arr, 0, d - 1);
        
        
        // Reverse the remaining elements
        reverse(arr, d, n - 1);
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);

    }

    public static void reverse(int aray[], int sp, int ep) {
        while (sp < ep) {
            int temp = aray[sp];
            aray[sp] = aray[ep];
            aray[ep] = temp;
            sp++;
            ep--;
        }
    }
}
