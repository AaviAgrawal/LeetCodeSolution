class Solution {
    public String getEncryptedString(String s, int k) {
        char[] res = s.toCharArray();
        for(int j=0;j<k;j++){
            char o = res[0];
            for(int i=1;i<s.length();i++){
                res[i-1] = res[i];
            }
            res[s.length()-1] = o;
        }
        return new String(res);
    }
}