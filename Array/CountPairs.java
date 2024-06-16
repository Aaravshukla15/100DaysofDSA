// Given an integer array hours representing times in hours, return an integer denoting
// the number of pairs i, j where i < j and hours[i] + hours[j] forms a complete day.
// A complete day is defined as a time duration that is an exact multiple of 24 hours.
// For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.
// Example 1:
// Input: hours = [12,12,30,24,24]
// Output: 2
// Explanation:
// The pairs of indices that form a complete day are (0, 1) and (3, 4).
//   Link:https://leetcode.com/contest/weekly-contest-402/problems/count-pairs-that-form-a-complete-day-i/
// Solution 
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int[] count = new int[24];
        int pairs = 0;

        for (int hour : hours) {
            int remainder = hour % 24;
            int complement = (24 - remainder) % 24;  
            
            pairs += count[complement];
            count[remainder]++;
        }

        return pairs;
    }
}
