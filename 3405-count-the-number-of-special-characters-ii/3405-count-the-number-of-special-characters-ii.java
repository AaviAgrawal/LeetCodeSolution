class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lhm = new HashMap<>();
        HashMap<Character,Integer> hhm = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(Character.isLowerCase(c)) lhm.putIfAbsent(c,i);
            else if(Character.isUpperCase(c)) hhm.putIfAbsent(Character.toLowerCase(c),i);
        }
        int res = 0;
        boolean a = true;
        for(char c: lhm.keySet()){
            if(hhm.containsKey(c) && lhm.get(c) < hhm.get(c)){
                a = true;
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i) == c && i > hhm.get(c)){
                        a = false;
                        break;
                    }
                }
                if(a) res++;
            }
        }
        return res;
    }
}