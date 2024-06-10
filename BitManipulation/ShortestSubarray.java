// You are given an array nums of non-negative integers and an integer k.

// An array is called special if the bitwise OR of all of its elements is at least k.

// Return the length of the shortest special non-empty 
// subarray
//  of nums, or return -1 if no special subarray exists.
// Example 1:
// Input: nums = [1,2,3], k = 2
// Output: 1
// Explanation:
// The subarray [3] has OR value of 3. Hence, we return 1.
//   Link:https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/description/
// Solution
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
         int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            int currentOR = 0;
            
            // Calculate the OR for the current window
            for (int i = start; i <= end; i++) {
                currentOR |= nums[i];
            }
            while (currentOR >= k && start <= end) {
                minLength = Math.min(minLength, end - start + 1);
                start++;
                if (start <= end) {
                    currentOR = 0;
                    for (int i = start; i <= end; i++) {
                        currentOR |= nums[i];
                    }
                }
            }
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
