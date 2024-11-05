class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] r = new int[word.length()];
        long c = 0;
        for(int i=0;i<word.length();i++){
            c = ((c*10) + (word.charAt(i)-'0'))%m;
            if(c == 0) r[i] = 1;
            else r[i] = 0;
        }
        return r;
    }
}