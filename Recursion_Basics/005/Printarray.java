import java.util.List;
import java.util.Scanner;
public class Solution {
    public static void printNtimes( int n){
        // Write your code here.

        if (n > 0) {
            System.out.print("Coding Ninjas ");
            printNtimes(n - 1);
        }
    }

    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        printNtimes(n);
    }
}
