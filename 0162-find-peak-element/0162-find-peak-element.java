class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int ans = 0;
        int l=0,r= nums.length-1;
        while (l<=r){
            if(nums[l]>max){
                max = nums[l];
                ans = l;
            }
            if(nums[r]>max){
                max = nums[r];
                ans = r;
            }
            l++;
            r--;
        }
        return ans;
    }
}