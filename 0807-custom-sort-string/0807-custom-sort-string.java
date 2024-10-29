class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:order.toCharArray()){
            int count = hm.getOrDefault(c,0);
            for(int i=0;i<count;i++){
                sb.append(c);
            }
            hm.remove(c);
        }
        for(char c:hm.keySet()){
            int count = hm.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}