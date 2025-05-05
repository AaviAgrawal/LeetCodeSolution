class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList<>();
        int carry = 0;
        int i=num.length-1;
        while (k > 0 || carry > 0 || i >= 0) {
            int n = (i >= 0 ? num[i] : 0) + (k % 10) + carry;
            ls.add(0, n % 10);
            carry = n / 10;
            k /= 10;
            i--;
        }
        return ls;
    }
}