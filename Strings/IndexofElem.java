// Given two strings needle and haystack, return the index of the first occurrence
// of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Link - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

// Solution

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
    }
}
