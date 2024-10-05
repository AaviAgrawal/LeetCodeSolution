class Solution {
    public int heightChecker(int[] heights) {
        int max = heights[0];
        int min = heights[0];
        for(int i:heights){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:heights){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[] res = new int[heights.length];
        int index = 0;
        for(int i = min;i<=max;i++){
            int count = hm.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                res[index] = i;
                index++;
            }
        }
        int sum = 0;
        for(int i=0;i< res.length;i++){
            if(heights[i] != res[i]) sum++;
        }
        return sum;
    }
}