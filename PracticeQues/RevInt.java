// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// link- https://leetcode.com/problems/reverse-integer/
// Solution

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int dig = x % 10;
            // Check if rev will overflow/underflow after multiplying by 10 and adding dig
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0; // Underflow
            }
            rev = rev * 10 + dig;
            x = x / 10;
        }
        return rev;
    }
}
