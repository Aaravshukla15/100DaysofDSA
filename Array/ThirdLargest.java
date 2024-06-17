// Given an integer array nums, return the third distinct maximum number in this array. 
//   If the third maximum does not exist, return the maximum number.
 

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
//   Link:https://leetcode.com/problems/third-maximum-number/
// Solution
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> distinctNums = new TreeSet<>();
        
        for (int num : nums) {
            distinctNums.add(num);
            if (distinctNums.size() > 3) {
                distinctNums.pollFirst(); 
            }
        }
        
        if (distinctNums.size() < 3) {
            return distinctNums.last();
        } else {
            return distinctNums.first();
        }
    }
}
