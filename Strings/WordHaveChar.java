// You are given a 0-indexed array of strings words and a character x.
// Return an array of indices representing the words that contain the character x.
// Note that the returned array may be in any order.

// Example 1:
// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.'
// link - https://leetcode.com/problems/find-words-containing-character/
// solution - 

  class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     ArrayList<Integer> arr = new ArrayList<Integer>();   
     for(int i=0;i<words.length;i++){
        String c = words[i];
        if(c.contains(String.valueOf(x))){
            arr.add(i);
        }
     }
     return arr;
    }
}
