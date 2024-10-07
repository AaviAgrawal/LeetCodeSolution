class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = costs.length;
        for(int i:costs){
            if(i > max) max = i;
        }
        int[] countArr = new int[max+1];
        for(int i:costs){
            countArr[i]++;
        }
        int index = 0;
        for(int i=0;i<=max;i++){
            while (countArr[i] > 0){
                costs[index] = i;
                countArr[i]--;
                index++;
            }
        }
        int res = 0;
        for(int i=0;i<costs.length;i++){
            coins = coins-costs[i];
            if(coins < 0) return i;
        }
        return costs.length;
    }
}