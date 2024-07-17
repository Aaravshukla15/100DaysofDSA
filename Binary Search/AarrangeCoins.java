// You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins.
// The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.

// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.
// Link:https://leetcode.com/problems/arranging-coins/
// Solution: 
class Solution {
    public int arrangeCoins(int n) {
        int ans = 0;
        
        int row = 1;
        int count = n;
        int add = 0;
        for(int i=0;i<n;i++){
            
            if(count>=row){
                count = count - row;
                row = row + 1;
                add = add +1;
            }
            else{
                ans =  add;
                break;
            }
        }
        if(n==1){
            ans = n;
        }
        return ans;
    }
}
