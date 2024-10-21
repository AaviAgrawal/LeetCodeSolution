class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int op = 0;
        int psf = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minp) minp = prices[i];
            psf = prices[i] - minp;
            if(op < psf) op = psf;
        }
        return op;
    }
}