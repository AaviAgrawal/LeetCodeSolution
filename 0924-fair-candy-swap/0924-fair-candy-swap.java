class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;
        for(int i:aliceSizes) sumA += i;
        for(int i:bobSizes) sumB += i;
        int diff = (sumB-sumA)/2;
        Set<Integer> s = new HashSet<>();
        for(int i:bobSizes) s.add(i);
        for(int i:aliceSizes){
            if(s.contains(diff+i)){
                return new int[]{i,diff+i};
            }
        }
        return new int[0];
    }
}