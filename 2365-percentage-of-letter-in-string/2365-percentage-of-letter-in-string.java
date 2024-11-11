class Solution {
    public int percentageLetter(String s, char letter) {
        int c = 0;
        for(char a:s.toCharArray()) if(a == letter) c++;
        return (int)((double)c/s.length()*100);
    }
}