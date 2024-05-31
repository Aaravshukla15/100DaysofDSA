// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
//   Input:
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
// Output: 1
// Exlpanation: Since, 6 is present in 
// the array at index 4 (0-based indexing),
// output is 1.
// Link:https://www.geeksforgeeks.org/problems/who-will-win-1587115621/
// Solutiion

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int indexOf = -1;
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                indexOf = 1;
            }
        }
        return indexOf;
    }
}
