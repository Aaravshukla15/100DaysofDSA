// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

// Example 1:
// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output: 1 10000
// Explanation: minimum and maximum elements of array are 1 and 10000.
// Link  - https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
// Solve

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++){
         if(a[i]<min){
             min = a[i];
         }
         if(a[i]>max){
             max = a[i];
         }
        }
        return new Pair(min, max);
     
    }
}
