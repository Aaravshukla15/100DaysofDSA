// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//   Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Link:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
// Solution

class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> posNum = new ArrayList<>();
        List<Integer> negNum = new ArrayList<>();
        for(int num : nums){
            if(num>=0){
                posNum.add(num);
            }
            else{
                negNum.add(num);
            }
        }
        int[] res = new int[nums.length];
        int posIndex = 0, negIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=posNum.get(posIndex++);
            }else{
                res[i]=negNum.get(negIndex++);
            }
        }
        return res;
    }
}
