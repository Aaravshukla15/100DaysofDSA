// Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

// All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

// Note: You are not allowed to use any built-in library method to directly solve this problem.

 

// Example 1:

// Input: num = 26
// Output: "1a"
//   Link:https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Solution
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();
        
        // For 32-bit integer
        for (int i = 0; i < 8 && num != 0; i++) {
            hex.insert(0, hexChars[num & 0xF]);
            num >>= 4;
        }
        
        return hex.toString();
    }
}
