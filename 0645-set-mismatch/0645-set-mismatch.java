class Solution {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] r = new int[2];
        while (i < nums.length){
            int cindex = nums[i]-1;
            if(nums[cindex] != nums[i]) swap(nums,cindex,i);
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1 != j){
                r[0] = nums[j];
                r[1] = j+1;
            }
        }
        return r;
    }
}