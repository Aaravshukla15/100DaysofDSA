import java.util.Scanner;

public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] fib = new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }

      return fib;
    }

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] fibonacciArray = generateFibonacciNumbers(n);

        for (int i = 0; i <= n; i++) {
        System.out.print(fibonacciArray[i] + " ");
      }
    }
}
