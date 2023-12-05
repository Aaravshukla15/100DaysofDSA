//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).Return the running sum of nums.

class ArraySum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++ ){
            result[i]= nums[i]+result[i-1];
        }
        return result;
    }
}
