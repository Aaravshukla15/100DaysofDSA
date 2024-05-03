//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
// Input:
// N = 5
// A[] = {-2, 1, -4, 5, 3}
// Output: 1
// Explanation: min = -4, max =  5. Sum = -4 + 5 = 1

class MinMAxSum
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(min>A[i]){
                min = A[i];
            }
            if(A[i]>max){
                max = A[i];
            }
        }
        int sum = min + max;
        return sum;
    }
}
