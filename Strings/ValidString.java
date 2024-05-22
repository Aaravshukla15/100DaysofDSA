// A word is considered valid if:

// It contains a minimum of 3 characters.
// It contains only digits (0-9), and English letters (uppercase and lowercase).
// It includes at least one vowel.
// It includes at least one consonant.
// You are given a string word.

// Return true if word is valid, otherwise, return false.

// Notes:

// 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
// A consonant is an English letter that is not a vowel.
// Example 1:
// Input: word = "234Adas"
// Output: true
// Explanation:
// This word satisfies the conditions.

// Link - https://leetcode.com/problems/valid-word/description/
// Solution

class Solution {
    public static boolean isValid(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        String vowels = "aeiouAEIOU";
        String digitsAndLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (char c : word.toCharArray()) {
            if (digitsAndLetters.indexOf(c) == -1) {
                return false;
            }
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
