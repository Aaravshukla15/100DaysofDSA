// Count digits in a number
// Problem Statement: Given an integer N, write a program to count the number of digits in N.

public class Solution {
    public static int countDigits(int n){
    
        
        int count = 0;
        while (n != 0) {
            n /= 10; 
            count++;
        }
        return count;
    }
}
