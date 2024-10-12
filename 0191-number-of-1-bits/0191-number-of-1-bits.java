class Solution {
    public int hammingWeight(int n) {
        StringBuilder s = new StringBuilder();
        while(n>0){
            int rem = n%2;
            s.append(rem);
            n = n/2;
        }
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') sum++;
        }
        return sum;
    }
}