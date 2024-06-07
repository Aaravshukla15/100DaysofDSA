// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Link:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// Solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fI=-1;
        int lI = -1;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && lI == -1){
                fI=i;
            }
            if(nums[i]==target && fI!=-1){
                lI=i;
            }
        }
        arr[0]=fI;
        arr[1]=lI;
        return arr;
    }
}
