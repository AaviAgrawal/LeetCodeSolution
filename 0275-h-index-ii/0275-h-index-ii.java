class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int l = 0,r = citations.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(len-mid == citations[mid]) return len-mid;
            else if(len-mid > citations[mid]) l = mid+1;
            else r = mid-1;
        }
        return len-l;
    }
}