class Solution {
    public int minimumChairs(String s) {
        int r = 0,max = 0;
        for(char c:s.toCharArray()){
            if(c == 'E') r++;
            else{
                max = Math.max(r,max);
                r--;
            }
        }
        max = Math.max(r,max);
        return max;
    }
}