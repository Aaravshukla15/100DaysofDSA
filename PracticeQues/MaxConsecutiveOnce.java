// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

class MaxConsecutiveOnce {
        public int findMaxConsecutiveOnes(int[] nums) {
        int maX_count=0, current_Count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current_Count +=1;
                maX_count=Math.max(maX_count,current_Count);
            }
            else if(nums[i]==0){
                current_Count = 0;
            }
        }
        return maX_count;
    }
}
