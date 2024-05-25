// ou are given an array nums, where each number in the array appears either once or twice.

// Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.
// Example 1:

// Input: nums = [1,2,1,3]

// Output: 1

// Explanation:

// The only number that appears twice in nums is 1.
//   Link - https://leetcode.com/contest/biweekly-contest-131/problems/find-the-xor-of-numbers-which-appear-twice/description/
//   Solution
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Set<Integer> appearOnce = new HashSet<>();
        for(int num:nums){
            if(appearOnce.contains(num)){
                result ^= num;
                appearOnce.remove(num);
            }else{}
                appearOnce.add(num);
            }
            return result;
        }
    }
