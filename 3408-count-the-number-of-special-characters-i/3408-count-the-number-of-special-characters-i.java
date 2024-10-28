class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lhs = new HashSet<>();
        HashSet<Character> hhs = new HashSet<>();
        for (char c:word.toCharArray()){
            if(Character.isLowerCase(c)) lhs.add(c);
            else hhs.add(c);
        }
        int res = 0;
        for(char c:lhs){
            if(hhs.contains(Character.toUpperCase(c))) res++;
        }
        return res;
    }
}