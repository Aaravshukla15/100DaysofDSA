
public class Solution {
    public static int[] reverseArray(int n, int []nums) {

        int []reversedArray = new int[n];

        for (int i = n - 1; i >= 0; i--)
        {
            reversedArray[n - i - 1] = nums[i];
        }
        return reversedArray;
    }
}
