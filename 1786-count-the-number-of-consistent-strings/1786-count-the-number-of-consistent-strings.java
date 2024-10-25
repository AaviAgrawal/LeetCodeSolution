class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        for(char c:allowed.toCharArray()){
            s.add(c);
        }
        int res = 0;
        for(String ss: words){
            for(int i=0;i<ss.length();i++){
                if(!s.contains(ss.charAt(i))) break;
                if(i == ss.length()-1){
                    res++;
                }
            }
        }
        return res;
    }
}