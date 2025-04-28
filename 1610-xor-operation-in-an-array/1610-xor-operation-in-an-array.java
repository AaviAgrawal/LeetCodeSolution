class Solution {
    public int xorOperation(int n, int start) {
        int s = 0;
        for(int i=0;i<n;i++){
            int j = start + 2*i;
            s ^= j;
        }
        return s;
    }
}