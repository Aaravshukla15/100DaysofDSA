// You are given an integer array nums, an integer array queries, and an integer x.

// For each queries[i], you need to find the index of the queries[i]th occurrence
// of x in the nums array. If there are fewer than queries[i] occurrences of x,
// the answer should be -1 for that query.

// Return an integer array answer containing the answers to all queries.
// Example 1:

// Input: nums = [1,3,1,7], queries = [1,3,2,4], x = 1

// Output: [0,-1,2,-1]

//   Link - https://leetcode.com/contest/biweekly-contest-131/problems/find-occurrences-of-an-element-in-an-array/
//   Solution

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!indicesMap.containsKey(nums[i])) {
                indicesMap.put(nums[i], new ArrayList<>());
            }
            indicesMap.get(nums[i]).add(i);
        }
        
        int[] answer = new int[queries.length];
        // For each query, directly access the stored indices
        for (int i = 0; i < queries.length; i++) {
            if (!indicesMap.containsKey(x) || queries[i] > indicesMap.get(x).size()) {
                answer[i] = -1;
            } else {
                answer[i] = indicesMap.get(x).get(queries[i] - 1);
            }
        }
        
        return answer;
    }
}
