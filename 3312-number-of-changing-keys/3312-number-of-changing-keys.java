class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int r = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)) r++;
        }
        return r;
    }
}