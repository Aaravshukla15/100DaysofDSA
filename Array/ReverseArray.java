// Reverse the array using function

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 15, 20, 54, 9, 102, 212, 66, 55 };
        System.out.println("Orignal Arrays is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Reversed Arrays is:");
        reverse(arr);
    }

    public static void reverse(int aray[]) {
        int sp = 0;
        int ep = aray.length - 1;
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
