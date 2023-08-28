// Problem Statement:  Given a number check if it is a palindrome.

// An integer is considered a palindrome when it reads the same backward as forward.
public class Palindrome {
    public static boolean palindromeNumber(int num){
        // Write your code here.
        int rev = 0;
        int ans = num;
        while(num!=0){
            int digit = num%10;
            rev = rev *10 + digit;
            num = num /10;
        }

        return ans == rev;
    }
}
