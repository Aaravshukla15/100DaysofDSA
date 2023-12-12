// Given a fixed-length integer array arr, duplicate each occurrence of zero, 
// shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. 
// Do the above modifications to the input array in place and do not return anything.

// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==0 && i+1<len){
                for(int j=len-1;j>i+1;j-- ){
                    int temp =arr[j-1];
                    arr[j]=temp;;
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}
