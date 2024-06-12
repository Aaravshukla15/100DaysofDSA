// Given an array arr of integers, check if there exist two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]
// Example 1:
// Input: arr = [10,2,5,3]
// Output: true
// Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
//   Link:https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
// Solution
class Solution {
    public boolean checkIfExist(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for(int n :arr){
        if(set.contains(2*n) || n%2==0 && set.contains(n/2)){
            return true;
        }set.add(n);
       }
       return false;
    }
}
