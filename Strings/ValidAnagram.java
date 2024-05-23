// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
// Link - https://leetcode.com/problems/valid-anagram/description/
// Solution

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> SCount = new HashMap<>();
        Map<Character, Integer> TCount = new HashMap<>();

        for(char c : s.toCharArray()){
            SCount.put(c,SCount.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            TCount.put(c,TCount.getOrDefault(c,0)+1);
        }

        return SCount.equals(TCount);
    }
}
