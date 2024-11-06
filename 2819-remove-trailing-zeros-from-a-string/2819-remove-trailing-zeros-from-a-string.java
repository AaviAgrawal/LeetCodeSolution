class Solution {
    public String removeTrailingZeros(String num) {
        int e = num.length()-1;
        while (e>=0 && num.charAt(e) == '0') e--;
        return num.substring(0,e+1);
    }
}