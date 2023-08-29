public class FeboNterm {
    public static int findFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 10; 
        int result = findFibonacci(n);
        System.out.println("The " + n + "-th Fibonacci number is: " + result);
    }
}
