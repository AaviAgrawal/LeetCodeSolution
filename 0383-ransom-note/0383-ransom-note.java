class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character,Integer> hm = new HashMap<>();
        for(char i:magazine.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char a = ransomNote.charAt(i);
            if(hm.containsKey(a) && hm.get(a) > 0) hm.put(a, hm.get(a)-1);
            else return false;
        }
        return true;
    }
}