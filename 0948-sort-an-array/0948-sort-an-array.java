class Solution {
    public int[] sortArray(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int min = nums[0];
        int max = nums[0];
        for(int i:nums){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        int index = 0;
        for(int i=min;i<=max;i++){
            int count = hm.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}