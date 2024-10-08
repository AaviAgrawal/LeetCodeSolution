class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0,r = arr.length-1;
        // 0 2 1 0
        while (l<r){
            int mid = l+(r-l)/2;
            if(arr[mid] < arr[mid+1]) l = mid+1;
            else if(arr[mid] > arr[mid+1]) r = mid;
        }
        return l;
    }
}