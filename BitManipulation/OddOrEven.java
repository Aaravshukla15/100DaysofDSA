// Given a positive integer N, determine whether it is odd or even.
// Input:
// N = 1
// Output:
// odd
// Explanation:
// The output is self-
// explanatory.
//   Link:https://www.geeksforgeeks.org/problems/odd-or-even3618/1
//   Solution
class Solution{
    static String oddEven(int N){
        return (N & 1) == 0 ? "even":"odd";
    }
}
