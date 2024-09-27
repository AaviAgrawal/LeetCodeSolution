class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0,r = arr.length-1;
        int max = arr[0];
        int ans = 0;
        while (l<=r){
            if(arr[l] > max || arr[r] > max){
                if(arr[l] > arr[r] && arr[l] > max){
                    max = arr[l];
                    ans = l;
                }
                else{
                    max = arr[r];
                    ans = r;
                }
            }
            l++;
            r--;
        }
        return ans;
    }
}