// Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is distinct.

// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Link - https://leetcode.com/problems/contains-duplicate/description/
// First Solution
// this solution have time complexity more... second is perfect

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

// Second Solution

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }
            set.add(num);
        }
        return false; // No duplicates found
    }
}

