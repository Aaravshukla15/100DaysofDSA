// Given an integer array a[] of size n, find the highest element of the array. 
// The array will either be strictly increasing or strictly increasing and then strictly decreasing.

// Note: a[i] != a[i+1] 

// Example 1:

// Input:
// 11
// 1 2 3 4 5 6 5 4 3 2 1
// Output: 
// 6
// Explanation: 
// Highest element of array a[] is 6.
// Link - https://www.geeksforgeeks.org/problems/find-the-highest-number2259/1

class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int largest = 0;
        for(int nums : a){
            if(nums>largest){
                largest = nums;
            }
        }
        return largest;
    }
}
