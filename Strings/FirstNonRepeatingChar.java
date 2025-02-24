// Find the Index of the First Non-Repeating Character in a String
// Intuition
// Finds the index of the first non-repeating character in a given string s. If no such character exists, it returns -1. Let’s break it down step-by-step.

// Approach
// Count frequencies:Create an array of size 26 to store the frequency of each character in the string.
// Populate frequency array:Iterate through the string and update the count of each character by mapping 'a' to 0, 'b' to 1, and so on.
// Identify the first unique character:Iterate through the string again, checking if the frequency of each character is 1.Return the index of the first such character.
// Handle no unique characters:If no unique character is found, return -1.
// Complexity
// Time complexity: ( O(n) )
// Space complexity:( O(1) )
// Code
class FirstNonRepeatingChar {
    public int firstUniqChar(String s) {
        int []freq = new int[26];
    for(char c:s.toCharArray()){
        freq[c-'a']++;
    }    
    for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']==1){
            return i;
        }
    }
    return -1;
}
}
