class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0,h = arr.length-1;
        int res = arr.length+k;
        while(l<=h){
            int mid = (h+l)/2;
            if(arr[mid]>mid+k){
                res = mid+k;
                h = mid-1;
            } 
            else l = mid+1;
        }
        return res;
    }
}