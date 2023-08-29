import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number /= 10;
        }

        System.out.print(evenSum);
        System.out.print(" " + oddSum);

        
	}
}
