// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.

// Example 1:

// Input: n = 16
// Output: true
//   Link:https://leetcode.com/problems/power-of-four/description/
// Solution
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if((n & (n-1))!=0){
            return false;
        }
        return (n & 0xAAAAAAAA) == 0;
    }
}
