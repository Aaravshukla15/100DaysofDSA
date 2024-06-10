// You are given a 0-indexed integer array nums. A pair of integers x and y is called a strong pair if it satisfies the condition:

// |x - y| <= min(x, y)
// You need to select two integers from nums such that they form a strong pair and their bitwise XOR is the maximum among all strong pairs in the array.

// Return the maximum XOR value out of all possible strong pairs in the array nums.

// Note that you can pick the same integer twice to form a pair. 
// Example 1:
// Input: nums = [1,2,3,4,5]
// Output: 7
// Explanation: There are 11 strong pairs in the array nums: (1, 1), (1, 2), (2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (3, 5), (4, 4), (4, 5) and (5, 5).
// The maximum XOR possible from these pairs is 3 XOR 4 = 7.
//   Link:https://leetcode.com/problems/maximum-strong-pair-xor-i/description/
// Solution
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int ans = nums[i]^nums[j];
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i],nums[j])){
                    max = Math.max(max , nums[i]^nums[j]);
                }
            }
        }
        return max;
    }
}
