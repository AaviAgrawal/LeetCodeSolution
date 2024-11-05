class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s = "aeiou";
        int c = 0;
        for(int i=left;i<=right;i++){
            if(s.contains(words[i].charAt(0)+"") && s.contains(words[i].charAt(words[i].length()-1)+"")) c++;
        }
        return c;
    }
}