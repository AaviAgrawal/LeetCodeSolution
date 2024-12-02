class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0],min = nums[0];
        int maxsum = nums[0],minsum = nums[0];
        int totalsum = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],nums[i]+max);
            maxsum = Math.max(maxsum,max);

            min = Math.min(nums[i],nums[i]+min);
            minsum = Math.min(minsum,min);

            totalsum += nums[i];
        }
        int cirsum = totalsum-minsum;
        if(totalsum == minsum) return maxsum;
        return Math.max(cirsum,maxsum);
    }
}