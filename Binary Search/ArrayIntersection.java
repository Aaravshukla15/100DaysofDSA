// Given two integer arrays nums1 and nums2, return an array of their 
// intersection. Each element in the result must be unique and you may return the result in any order.
// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Link:https://leetcode.com/problems/intersection-of-two-arrays/
// solution
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        for(int num:nums1){
            map.add(num);
        }
        HashSet<Integer> map2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                map2.add(nums2[i]);
            }
        }
        int[] result = new int[map2.size()];
        int i=0;
        for(int num: map2){
            result[i++] = num;
        }
        return result;
    }
}
