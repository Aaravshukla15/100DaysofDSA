// You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.
// Return the number of special letters in word.

// Example 1:
// Input: word = "aaAbcBC"
// Output: 3

// Explanation:
// The special characters in word are 'a', 'b', and 'c'.
// Link - https://leetcode.com/problems/count-the-number-of-special-characters-i/
// Solution

  class Solution {
    public int numberOfSpecialChars(String word) {
        int count =0;
        Set<Character> upperCaseSet = new HashSet<>();
        Set<Character> lowerCaseSet = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char co = word.charAt(i);
            if(Character.isLowerCase(co)){
                lowerCaseSet.add(co);
            }else{
                upperCaseSet.add(Character.toLowerCase(co));
            }
        }
        for(char c: lowerCaseSet){
            if(upperCaseSet.contains(c)){
                count+=1;
            }
        }
        return count;
    }
}
