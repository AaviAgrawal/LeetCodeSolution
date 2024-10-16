class Solution {
    public boolean checkRecord(String s) {
        int p=0,a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'P') p++;
            else if(s.charAt(i) == 'A') a++;
        }
        if(a>1 || s.contains("LLL")) return false;
        return true;
    }
}