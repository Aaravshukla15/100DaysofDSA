// Given an integer n, return an array ans of length n + 1 such
// that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
// Example 1:
// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
//   Link:https://leetcode.com/problems/counting-bits/description/
// Solution
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0;i<=n;i++){
            ans[i] = countOnes(i);
        }
        return ans;
    }
    private static int countOnes(int number){
        int count = 0;
        while(number>0){
            count += number & 1;
            number >>=1;
        }
        return count;
    }
}
