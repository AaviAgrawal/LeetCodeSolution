class Solution {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        while (i < nums.length){
            int cindex = nums[i]-1;
            if(nums[i] != nums[cindex]) swap(nums,i,cindex);
            else i++;
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j] != j+1) res.add(j+1);
        }
        return res;
    }
}