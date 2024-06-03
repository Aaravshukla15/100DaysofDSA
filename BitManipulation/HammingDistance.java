// The Hamming distance between two integers is the number of positions at which
// the corresponding bits are different.
// Given two integers x and y, return the Hamming distance between them.
// Example 1:
// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑
// The above arrows point to positions where the corresponding bits are different.
//   Link: https://leetcode.com/problems/hamming-distance/description/
// Solution
class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int xor = x^y;
        while(xor!=0){
            ans += xor & 1;
            xor >>=1;
        }
        return ans;
    }
}
