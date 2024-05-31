// Given an integer array nums, in which exactly two elements appear only once 
//   and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.


// Example 1:

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
//   Link: https://leetcode.com/problems/single-number-iii/description
//   Solution
  class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor ^= num;
        }
        int diffBit = xor & (-xor);  
        
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        
        return result;
    }
}
