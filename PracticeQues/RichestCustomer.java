/* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ 
customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.A customer's wealth
is the amount of money they have in all their bank accounts. The richest customer is the customer
that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10. */

class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maxvalsoFar = 0;
        for(int i =0; i<accounts.length;i++){
            int currentCustwealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                currentCustwealth += accounts[i][j];
            }
            maxvalsoFar = Math.max(maxvalsoFar,currentCustwealth);
        }
        return maxvalsoFar;
    }
}
