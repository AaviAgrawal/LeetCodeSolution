class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int start,int end){
        if(start >= end) return;
        int mid = start+(end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public void merge(int[] nums,int start,int mid,int end){
        int[] left = Arrays.copyOfRange(nums,start,mid+1);
        int[] right = Arrays.copyOfRange(nums,mid+1,end+1);
        int i=0,j=0,k=start;
        while(i<left.length && j<right.length){
            if(left[i] <= right[j]) nums[k++] = left[i++];
            else nums[k++] = right[j++];
        }
        while(i<left.length) nums[k++] = left[i++];
        while(j<right.length) nums[k++] = right[j++];
    }
}