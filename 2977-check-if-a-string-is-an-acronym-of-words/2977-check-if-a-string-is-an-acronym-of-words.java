class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) return false;
        int j = 0;
        for(String i:words){
            if(i.charAt(0) != s.charAt(j)) return false;
            j++;
        }
        return true;
    }
}