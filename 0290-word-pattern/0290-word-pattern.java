class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> hm = new HashMap<>();
        String[] a = s.split(" ");
        if(pattern.toCharArray().length != s.split(" ").length) return false;
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String q = a[i];
            if(hm.containsKey(p)){
                if(!hm.get(p).equals(q)) return false;
            }
            else{
                if(hm.containsValue(q)) return false;
                hm.put(p,q);
            }
        }
        return true;
    }
}