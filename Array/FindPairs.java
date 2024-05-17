// Find Pair Given Difference
// Given an array arr[] of size n and an integer x, 
// return 1 if there exists a pair of elements in the 
// array whose absolute difference is x, otherwise, return -1.
// Example: Input:
// n = 6
// x = 78
// arr[] = {5, 20, 3, 2, 5, 80}
// Output:
// 1
// Explanation:
// Pair (2, 80) have absolute difference of 78.
// Link - https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1

// Solution
class FindPairs {
    public int findPair(int n, int x, int[] arr) {
        // code here

        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num + x) || seen.contains(num - x)) {
                return 1;
            }
            seen.add(num);
        }
        
        return -1;
      }
    }
    
