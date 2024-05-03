// Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice,
// except for one number which will occur only once. Find the number occurring only once.
//   Example 1:

// Input:
// N = 5
// A = {1, 1, 2, 5, 5}
// Output: 2
// Explanation: 
// Since 2 occurs once, while
// other numbers occur twice, 
// 2 is the answer.
// Link - https://www.geeksforgeeks.org/problems/element-appearing-once2552/1

// solve 1
class Sol
{
    public static int search(int A[], int N)
  {
        if (N == 1)
            return A[0];
            
        int result = 0;
        for (int i = 0; i < N - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return A[N - 1];
    }
}

// Solve2


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
  {
        int result = 0;
        for(int i =0; i<N;i++){
            result = result ^ A[i];
        }
        return result;
    }
}
