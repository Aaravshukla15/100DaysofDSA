// Given an array a of size N which contains elements from 0 to N-1, 
// you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.
// If no such element is found, return list containing [-1]. 

// Note: The extra space is only for the array to be returned.
// Try and perform all operations within the provided array. 
// Link - https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&status=solved&sortBy=submissions

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
      ArrayList<Integer> duplicate = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }
        
        // Identify duplicates
        for (int i = 0; i < n; i++) {
            if (arr[i] / n > 1) {
                duplicate.add(i);
            }
        }
        
        // If no duplicates found, add -1 to the list
        if (duplicate.isEmpty()) {
            duplicate.add(-1);
        }

        return duplicate;
    }
}
