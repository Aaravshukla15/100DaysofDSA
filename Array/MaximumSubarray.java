// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Link - https://leetcode.com/problems/maximum-subarray/description/ 

// Solution
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        return maxGlobal;
    }
}
