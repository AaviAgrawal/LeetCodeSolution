class Solution {
    public int largestAltitude(int[] gain) {
        int ans = gain[0] < 0 ? 0 : gain[0];
        for(int i=0;i<gain.length-1;i++){
            gain[i+1] = gain[i]+gain[i+1];
            ans = Math.max(gain[i+1],ans);
        }
        return ans;
    }
}