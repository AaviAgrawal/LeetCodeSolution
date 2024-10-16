class Solution {
    public boolean detectCapitalUse(String word) {
        String str = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.equals(str))
            return true;
        return false;
    }
}