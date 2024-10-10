class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char i:s.toCharArray()){
             hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(hm.get(a) == 1) return i;
        }
        return -1;
    }
}