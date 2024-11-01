class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        int v = 0;
        int con = 0;
        word = word.toLowerCase();
        for(char c:word.toCharArray()){
            if(!Character.isAlphabetic(c) && !Character.isDigit(c)) return false;
            if(Character.isAlphabetic(c)){
                if(c == 'a' || c=='e' || c=='i' || c=='o' ||c=='u') v++;
                else con++;
            }
        }
        return v>0 && con>0;
    }
}