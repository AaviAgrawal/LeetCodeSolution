class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minI = 0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] < matrix[i][minI]) minI = j;
            }
            int maxE = matrix[i][minI];
            boolean isMax = true;
            for(int k=0;k<matrix.length;k++){
                if(maxE < matrix[k][minI]){
                    isMax = false;
                    break;
                }
            }
            if(isMax) l.add(maxE);
        }
        return l;
    }
}