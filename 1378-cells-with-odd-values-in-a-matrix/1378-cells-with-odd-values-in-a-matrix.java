class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];
        for(int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j=0;j<a[r].length;j++){
                a[r][j] += 1;
            }
            for(int k=0;k<a.length;k++){
                a[k][c] += 1;
            }
        }
        int ans = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]%2 == 1) ans += 1;
            }
        }
        return ans;
    }
}