class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min = Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));
            max = temp;
            res = Math.max(res,max);
        }
        return res;
    }
}