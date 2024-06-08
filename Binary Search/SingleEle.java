// Single Element in a Sorted Array
// You are given a sorted array consisting of only integers where
// every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.
// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Link:https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// Solution
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i]) == true){
             int temp = map.get(nums[i]);
             map.put(nums[i],temp+1);   
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0; i<nums.length;i++){
            if(map.get(nums[i])==1){
               return nums[i];
            }
        }
        return -1;
    }
}
