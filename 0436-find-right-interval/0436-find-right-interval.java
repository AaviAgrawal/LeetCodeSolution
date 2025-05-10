class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int start[][] = new int[n][2];
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            start[i][0] = intervals[i][0];
            start[i][1] = i;
        }
        Arrays.sort(start,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            int index = -1;
            int e = intervals[i][1];
            int l = 0,r = n-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(start[mid][0] >= e){
                    index = start[mid][1];
                    r = mid-1;
                }
                else l = mid+1;
            }
            res[i] = index;
        }
        return res;
    }
}