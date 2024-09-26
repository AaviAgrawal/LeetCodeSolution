class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[n+m];
        int k = 0;
        for(int i=0;i<m;i++){
            nums[k] = nums1[i];
            k++;
        }
        for (int i=0;i<n;i++){
            nums[k] = nums2[i];
            k++;
        }
        Arrays.sort(nums);
        int total = nums.length;
        if(total%2 == 0){
            int p = nums[total/2 - 1];
            int q = nums[total/2];
            return ((double) p + (double) q)/2.0;
        }
        return (double) nums[total/2];
    }
}