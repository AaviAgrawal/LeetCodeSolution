class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        int j = nums.length/3;
        for(Map.Entry<Integer, Integer> i:hm.entrySet()){
            if(i.getValue()>j) l.add(i.getKey());
        }
        return l;
    }
}