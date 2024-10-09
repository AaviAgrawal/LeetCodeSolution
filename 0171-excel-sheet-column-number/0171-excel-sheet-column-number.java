class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i:columnTitle.toCharArray()){
            sum = sum*26;
            sum = sum + (i-'A'+1);
        }
        return sum;
    }
}