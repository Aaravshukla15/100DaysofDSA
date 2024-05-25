// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Link - https://leetcode.com/problems/reverse-string/description/
// Solution
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char[] c = new char[len];
        for(int i=0;i<len;i++){
            c[i]=s[len-1-i];
        }
       System.arraycopy(c, 0, s, 0, len);
    }
}
