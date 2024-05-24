// You are given a 0-indexed string s typed by a user.
// Changing a key is defined as using a key different from the last used key. 
// For example, s = "ab" has a change of a key while s = "bBBb" does not have any.

// Return the number of times the user had to change the key.

// Note: Modifiers like shift or caps lock won't be counted in changing the key that
// is if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.

//   Link - https://leetcode.com/problems/number-of-changing-keys/description/
//   Solution

class Solution {
    public int countKeyChanges(String s) {
 int keyChanges = 0;
        Character lastKey = null;
        
        for (char c : s.toCharArray()) {
            // Convert character to lowercase for comparison
            char lowerChar = Character.toLowerCase(c);
            
            // Check if the character is a different key than the last used one
            if (lastKey == null || lowerChar != lastKey) {
                keyChanges++;
                lastKey = lowerChar;
            }
        }
        
        // Subtract 1 to exclude initial case where lastKey is null
        return (keyChanges > 0) ? keyChanges - 1 : 0;
        }
    }
