// Given three integer arrays nums1, nums2, and nums3, return a distinct 
//   array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

// Example 1:

// Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
// Output: [3,2]
// Explanation: The values that are present in at least two arrays are:
// - 3, in all three arrays.
// - 2, in nums1 and nums2.
//   Link:https://leetcode.com/problems/two-out-of-three/description/
// Solution
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer,Integer> countMap = new HashMap<>();

        addElements(countMap,nums1);
        addElements(countMap,nums2);
        addElements(countMap,nums3);

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue()>=2){
                result.add(entry.getKey());
            }
        }
        return result;
    }
    private void addElements(Map<Integer, Integer> map, int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                seen.add(num);
            }
        }
    }
}
