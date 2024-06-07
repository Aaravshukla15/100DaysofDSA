// Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4.

//   Link:https://leetcode.com/problems/binary-search/
// Solution
class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        for(int num=0;num<nums.length;num++){
            if(nums[num] == target){
                ans = num; 
            }
        }
        return ans;
    }
}
  
