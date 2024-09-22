class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r= nums.length-1;
        while (l<=r){
            if(nums[l] == target || nums[r] == target) return true;
            l++;
            r--;
        }
        return false;
    }
}