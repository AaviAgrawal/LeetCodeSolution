class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int r = s.length();
        for(int i:hm.values()){
            if(i >= 2) r = r-(i-1);
        }
        return r;
    }
}