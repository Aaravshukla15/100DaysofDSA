// Given two binary strings a and b, return their sum as a binary string.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
// Link - https://leetcode.com/problems/add-binary/description/
// Solution

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans =  new StringBuilder();
        int aLen =  a.length() -1;
        int bLen =  b.length() -1;
        int carry = 0;
        while(aLen >= 0 || bLen>=0 || carry >0){
            int aBit = (aLen>=0) ? a.charAt(aLen) - '0' : 0;
            int bBit = (bLen>=0) ? b.charAt(bLen) - '0' : 0;

            int sum = aBit + bBit + carry;
            carry = sum /2;
            ans.append(sum%2);

            aLen--;
            bLen--;
        }
        return ans.reverse().toString();
    }
}
  
