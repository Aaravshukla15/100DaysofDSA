// Reverse the array from Specific starting point and Ending Point

public class ReversearrayAtIndex {
    public static void main(String[] args) {
        int[] arr = { 15, 20, 54, 9, 102, 212, 66, 55, 77 };
        int spoA = 2;
        int epoA = 6;
        System.out.println("Orignal Arrays is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Specified Reversed Arrays is:");
        reverse(arr, spoA, epoA);
    }

    public static void reverse(int aray[], int sp, int ep) {
        // int sp = 0;
        // int ep = aray.length - 1;
        while (sp < ep) {
            int temp = aray[sp];
            aray[sp] = aray[ep];
            aray[ep] = temp;
            sp++;
            ep--;
        }
        for (int i = 0; i < aray.length; i++) {
            System.out.print(aray[i] + " ");
        }
    }
}
