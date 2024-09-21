class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = (num / 2) + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long square = (long) mid * mid; 
            if (num == square) return true;
            else if (num > square) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
