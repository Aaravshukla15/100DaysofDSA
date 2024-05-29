// Given two strings ransomNote and magazine, return true if ransomNote
// can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
//   Link: https://leetcode.com/problems/ransom-note/description/
// Solution
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[26]; // Array to count frequency of each letter

        // Count each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (charCounts[c - 'a'] == 0) {
                return false; // Not enough of this character
            }
            charCounts[c - 'a']--;
        }

        return true;
    }
}
