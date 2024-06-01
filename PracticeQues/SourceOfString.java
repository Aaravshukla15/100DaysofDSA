// You are given a string s. The score of a string is defined 
// as the sum of the absolute difference between the ASCII values of adjacent characters.

// Return the score of s.
// Example 1:

// Input: s = "hello"

// Output: 13
// Link:https://leetcode.com/problems/score-of-a-string/description/
// Solution
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=1;i<s.length();i++){
            int ascii1 = (int) s.charAt(i - 1);
            int ascii2 = (int) s.charAt(i);
            score += Math.abs(ascii1 - ascii2);
        }
        return score;
    }
}
