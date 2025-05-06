class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int i = 0;
        int steps = 1;
        int[][] res = new int[rows*cols][2];
        res[i++] = new int[]{rStart,cStart};
        int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};
        while(i < rows*cols){
            for(int d=0;d<4;d++){
                int dx = move[d][0];
                int dy = move[d][1];
                for(int s=0;s<steps;s++){
                    rStart += dx;
                    cStart += dy;
                    if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                        res[i++] = new int[]{rStart,cStart};
                    }
                }
                if(d == 1 || d == 3) steps++;
            }
        }
        return res;
    }
}