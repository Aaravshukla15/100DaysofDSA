// perform linear search for a given number num

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 45, 5, 4, 51, 2, 4, 6 };
        int n = arr.length;
        int num = 4;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println(i);
            }
        }
    }
}
