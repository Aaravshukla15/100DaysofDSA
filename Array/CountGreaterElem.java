// Given Aarray of N elements, Count the elemnts having atleast one element greater than itself. 

public class CountGreaterElem {
    public static void main(String[] args) {
        int[] arr = { -8, 5, -4, 2, 6, 54, 1, -1, 54, 21 };
        // int[] arr = { 5, 5, 5, 5 };
        int count = 0;
        System.out.println("Orignal Arrays is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Elenents having number greater than itself is:");
        countElem(arr, count);
    }

    public static void countElem(int[] arr, int count) {

        int maxElem = Integer.MIN_VALUE;
        // int maxElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxElem) {
                count = count + 1;
            }
        }
        count = arr.length - count;
        System.out.println(count);

    }
}
