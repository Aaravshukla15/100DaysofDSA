// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
//   Link:https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
// Solution
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int num: nums1){
            map1.put(num, map1.getOrDefault(num,0)+1);
        }

        List <Integer> nList = new ArrayList<>();
        for(int num: nums2){
            if(map1.containsKey(num) && map1.get(num)>0){
                nList.add(num);
                map1.put(num,map1.get(num)-1);
            }
        }
        int[] result = new int[nList.size()];
        int i=0;
        for(int num:nList){
            result[i++] = num;
        }
        return result;
    }
}
