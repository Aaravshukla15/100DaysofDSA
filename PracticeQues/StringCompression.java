// Given a string word, compress it using the following algorithm:

// Begin with an empty string comp. While word is not empty, use the following operation:
// Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
// Append the length of the prefix followed by c to comp.
// Return the string comp.

// Example 1:
// Input: word = "abcde"
// Output: "1a1b1c1d1e"
// Explanation:
// Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
//   Link:https://leetcode.com/problems/string-compression-iii/description/
// Solution
class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        
        int i = 0;
        int n = word.length();
        
        while (i < n) {
            char c = word.charAt(i);
            int count = 0;
            
            while (i < n && word.charAt(i) == c && count < 9) {
                count++;
                i++;
            }
            
            comp.append(count).append(c);
        }
        
        return comp.toString();
    }
}
