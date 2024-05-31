// Given an array A[] of size n. The task is to find the largest element in it.
// Input:
// n = 5
// A[] = {1, 8, 7, 56, 90}
// Output:
// 90
// Explanation:
// The largest element of given array is 90.
//   Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/
//   Solution
class Compute {
    
    public int largest(int arr[], int n)
    {
        int largestElem = arr[0];
        for(int num : arr){
            if(num > largestElem ){
                largestElem = num;
            }
        }
        return largestElem;
    }
}
