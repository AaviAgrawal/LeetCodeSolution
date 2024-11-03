class Solution {
    public String addStrings(String num1, String num2) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        while (i>=0 || j>=0 ||c != 0){
            int a = (i>=0) ? num1.charAt(i)-'0' : 0;
            int b = (j>=0) ? num2.charAt(j)-'0' : 0;
            sb.append((a+b+c)%10);
            c = (a+b+c)/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}