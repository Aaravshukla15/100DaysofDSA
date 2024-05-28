// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]
// Output: 1

//   Link:https://leetcode.com/problems/single-number/description/
// Solution
class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNum = 0;
        for(int num:nums){
            uniqueNum ^= num;
        }
        return uniqueNum;
    }
}
