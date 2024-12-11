class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] f = new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n) f[n] += 1;
            else f[citations[i]] += 1;
        }
        int idx = n;
        int s = f[idx];
        while(idx>s){
            idx--;
            s += f[idx];
        }
        return idx;
    }
}