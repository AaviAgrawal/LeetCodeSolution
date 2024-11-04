class Solution {
    public boolean judgeCircle(String moves) {
        int count = 0;
        int count2 = 0;
        for(char c:moves.toCharArray()){
            if(c == 'L') count++;
            else if(c == 'R') count--;
            else if(c == 'U') count2++;
            else count2--;
        }
        return count == 0 && count2 == 0;
    }
}