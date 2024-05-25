// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Link - https://leetcode.com/problems/length-of-last-word/description/
// Solution
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        // removes extra space
      
        int lastSpaceIndex = s.lastIndexOf(' ');
        String lastWord = s.substring(lastSpaceIndex + 1);
        
        return lastWord.length();
    }
}
