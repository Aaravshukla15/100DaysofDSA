
public class Solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {

            int mini = arr[i];
            int minIndex = i;

            for (int j = i; j < n; j++)
            {
                // Update the minimum elem
                if (mini > arr[j])
                {
                    mini = arr[j];
                    minIndex = j;
                }
            }

            // Swap the min elem with the first elem of the unsorted part
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
