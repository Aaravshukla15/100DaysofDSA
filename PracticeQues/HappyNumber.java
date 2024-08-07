// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a 
// cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.
// Link:https://leetcode.com/problems/happy-number/description/
// Solution 
class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private static int getNextNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
}
}
