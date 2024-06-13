// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100
//   Link:https://leetcode.com/problems/powx-n/description/
// Solution
class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE){
            x=x*x;
            n=n/2;
        }
        if(n<0){
            x=1/x;
            n=-n;
        }
        return pow(x,n);
    }

    private static double pow(double x, int n){
        if(n==0){
            return 1.0;
        }
        double half = pow(x,n/2);

        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }

}
