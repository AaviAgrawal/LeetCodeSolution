class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start+end)/2;
        
        while(start<=end) {
        	if(target == nums[mid]) return mid;
        	else if(target < nums[mid]) end = mid - 1;
        	else start = mid + 1;
        	mid = (start + end)/2;
        }
        int[] arr1 = new int[nums.length + 1];
        for(int i=0;i<nums.length;i++) {
        	arr1[i] = nums[i];
        }
        arr1[nums.length] = target;
        Arrays.sort(arr1);
        int start1 = 0;
        int end1 = arr1.length - 1;
        int mid1 = (start+end)/2;
        while(start1<=end1) {
        	if(target == arr1[mid1]) return mid1;
        	else if(target < arr1[mid1]) end1 = mid1 - 1;
        	else start1 = mid1 + 1;
        	mid1 = (start1 + end1)/2;
        }
        return -1;
    }
}