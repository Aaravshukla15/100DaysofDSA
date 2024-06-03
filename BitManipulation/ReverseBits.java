// Reverse bits of a given 32 bits unsigned integer.

// Example 1:

// Input: n = 00000010100101000001111010011100
// Output:    964176192 (00111001011110000010100101000000)
// Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, 
//   so return 964176192 which its binary representation is 00111001011110000010100101000000.
//   Link:https://leetcode.com/problems/reverse-bits/
// Solution
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i=0; i< 32 ; i++){
            result = ( result<<1 ) | (n & 1 );
             n >>=1;
        }
        return result;
    }
}
