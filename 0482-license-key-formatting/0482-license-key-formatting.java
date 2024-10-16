class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","");
        s=s.toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        for(int i=k;i<s.length();i=i+k){
            sb.insert(s.length()-i,"-");
        }
        return sb.toString();
    }
}