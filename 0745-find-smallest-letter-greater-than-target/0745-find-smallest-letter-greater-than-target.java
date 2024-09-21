class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0,r = letters.length-1;
        char res = letters[0];
        while(l<=r){
            int mid = l+(r-l)/2;
            if(letters[mid] == (char)target+1) return letters[mid];
            else if(letters[mid] > target){
                res = letters[mid];
                r = mid-1;
            }
            else l = mid+1;
        }
        return res;
    }
}