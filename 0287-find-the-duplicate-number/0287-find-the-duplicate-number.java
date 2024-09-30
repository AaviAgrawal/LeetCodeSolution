class Solution {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int cindex = nums[i]-1;
            if(nums[cindex] != nums[i]) swap(nums,cindex,i);
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1 != j) return nums[j];
        }
        return -1;
    }
}