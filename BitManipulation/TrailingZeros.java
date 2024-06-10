// You are given an array of positive integers nums.

// You have to check if it is possible to select two or more elements in the array such 
//   that the bitwise OR of the selected elements has at least one trailing zero in its binary representation.

// For example, the binary representation of 5, which is "101", does not have any trailing
//   zeros, whereas the binary representation of 4, which is "100", has two trailing zeros.

// Return true if it is possible to select two or more elements whose bitwise OR has trailing 
//   zeros, return false otherwise.
// Example 1:
// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.
//   Link:https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/description/
//   Solution
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        boolean hasZero = false;
        if(nums.length < 2){
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (((nums[i] | nums[j]) & 1) == 0) {
                    hasZero = true;
                }
            }
        }
        return hasZero;
    }
}

