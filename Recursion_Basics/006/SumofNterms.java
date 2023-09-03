//Recursive way
import java.util.Scanner;

public class Solution {
    public static long sumFirstN(long n) {
        // Write your code here.
        if (n == 1) {
            return 1; 
        } 
        else {
            long sumOfPreviousTerms = sumFirstN(n - 1); 
            return n + sumOfPreviousTerms;
        }
       
    }

    public static void main(String[] args){
        Scanner newn = new Scanner(System.in);
        long n = newn.nextInt();
        long sum = sumFirstN(n);
        System.out.print(sum); 
    }
}

// Iterative Way

// import java.util.Scanner;

// public class Solution {
//     public static long sumFirstN(long n) {
//         // Write your code here.
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum = sum +i;
//         }
//         return sum;
//     }

//     public static void main(String[] args){
//         Scanner newn = new Scanner(System.in);
//         int n = newn.nextInt();
//         sumFirstN(n);
//     }
// }
