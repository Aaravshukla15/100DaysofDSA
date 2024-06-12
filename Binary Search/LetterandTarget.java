// You are given an array of characters letters that is sorted in non-decreasing order,
// and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
// Example 1:
// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//   Link:https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Solution
  class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min = 'z';
        boolean found = false;
        for( char c : letters){
             if (c > target && c <= min) {
                min = c;
                found = true;
            }
        }
        if (!found) {
            return letters[0];
        }

        return min;
    }
}
