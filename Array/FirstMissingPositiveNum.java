// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Link - https://leetcode.com/problems/first-missing-positive/description/
// Solution

class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place nums[i] in its correct position if nums[i] is in the range [1, n]
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with the number at its correct position nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        
        for(int num : nums){
            if(min==num){
                min=min+1;
            }
        }
        return min;
    }
}
