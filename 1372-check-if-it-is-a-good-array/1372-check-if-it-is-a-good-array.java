class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        for(int i=1;i<nums.length;i++){
            gcd = gcd(gcd,nums[i]);
        }
        return gcd == 1;
    }
    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}