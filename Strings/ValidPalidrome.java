// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
// and removing all non-alphanumeric characters, it reads the same forward and backward. 
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Link - https://leetcode.com/problems/valid-palindrome/description/
// Solution
class Solution {
    public boolean isPalindrome(String s) {
     s = s.toLowerCase();

     StringBuilder newStr = new StringBuilder();
     for(char c: s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            newStr.append(c);
        }
     }

     String newString = newStr.toString();
     String revnewString = newStr.reverse().toString();

     return newString.equals(revnewString);   
    }
}
