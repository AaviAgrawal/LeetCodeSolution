import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int k = nums.get(i);
            boolean found = false;
            for(int j=0;j<k;j++){
                if((j | (j+1)) == k){
                    ans[i] = j;
                    found = true;
                    break;
                }
            }
            if(!found) ans[i] = -1;
        }
        return ans;
    }
}
