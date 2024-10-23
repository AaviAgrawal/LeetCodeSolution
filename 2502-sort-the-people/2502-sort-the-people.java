class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        int index = 0;
        for(int i=names.length-1;i>=0;i--){
            res[index] = hm.get(heights[i]);
            index++;    
        }
        return res;
    }
}