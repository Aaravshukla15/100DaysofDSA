// Given an array Arr of size N, print the second largest distinct 
//   element from an array. If the second largest element doesn't exist then return -1.
//   Input: 
// N = 6
// Arr[] = {12, 35, 1, 10, 34, 1}
// Output: 34
// Explanation: The largest element of the 
// array is 35 and the second largest element
// is 34.
//   Link: https://www.geeksforgeeks.org/problems/second-largest3735/
// Solution
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largestElem = arr[0];
        int secLargest = -1;
        for(int num : arr){
            if(num > largestElem ){
                largestElem = num;
            }
        }
        
        for(int num: arr){
            if( num > secLargest && num != largestElem){
                secLargest = num;
            }
        }
        return secLargest;
    }
}
