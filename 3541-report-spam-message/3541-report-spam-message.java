class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
       int res = 0;
        HashSet<String> hs = new HashSet<>();
        for(String w:bannedWords){
            hs.add(w);
        }
        for(String s:message){
            if(hs.contains(s)) res++;
        }
        return res>=2;
    }
}