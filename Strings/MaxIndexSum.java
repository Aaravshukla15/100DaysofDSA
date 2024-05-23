// Given two arrays of strings list1 and list2, find the common strings with the least index sum.

// A common string is a string that appeared in both list1 and list2.

// A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

// Return all the common strings with the least index sum. Return the answer in any order.

// Example 1:

// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
// Output: ["Shogun"]
// Explanation: The only common string is "Shogun".
//   Link - https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
//   Solution - 
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for(int j = 0; j<list2.length;j++){
            String word =list2[j];
            if(map.containsKey(word)){
                int indexSum = j + map.get(word);
                if(indexSum< minIndexSum){
                    result.clear();
                    result.add(word);
                    minIndexSum = indexSum;
                }
                else if(indexSum == minIndexSum){
                    result.add(word);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
