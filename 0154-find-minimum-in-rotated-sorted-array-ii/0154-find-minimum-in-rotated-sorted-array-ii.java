class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int l=0,r=nums.length-1;
        while (l<=r){
            if(nums[l]<min || nums[r]<min){
                if(nums[l]<min) min = nums[l];
                else min = nums[r];
            }
            l++;
            r--;
        }
        return min;
    }
}