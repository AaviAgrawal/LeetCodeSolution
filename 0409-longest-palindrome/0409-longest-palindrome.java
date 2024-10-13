class Solution {
    public int longestPalindrome(String s) {
        if(s == null && s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))) hs.add(s.charAt(i));
            else{
                hs.remove(s.charAt(i));
                count++;
            }
        }
        if(hs.isEmpty()) return count*2;
        return count*2+1;
    }
}