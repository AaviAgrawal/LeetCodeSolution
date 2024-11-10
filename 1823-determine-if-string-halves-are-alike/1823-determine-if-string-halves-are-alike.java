class Solution {
    public boolean halvesAreAlike(String s) {
        int vl = 0,vr = 0,l = (s.length()/2)-1,r = s.length()/2;
        s = s.toLowerCase();
        while (l>=0 && r<=s.length()-1){
            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u') vl++;
            if(s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r) == 'o' || s.charAt(r) == 'u') vr++;
            l--;
            r++;
        }
        return vl == vr;
    }
}