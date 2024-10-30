class Solution {
    public int romanToInt(String s) {
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'I') arr[i] = 1;
            else if(s.charAt(i) == 'V') arr[i] = 5;
            else if(s.charAt(i) == 'X') arr[i] = 10;
            else if(s.charAt(i) == 'L') arr[i] = 50;
            else if(s.charAt(i) == 'C') arr[i] = 100;
            else if(s.charAt(i) == 'D') arr[i] = 500;
            else if(s.charAt(i) == 'M') arr[i] = 1000;
        }
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            if(arr[i] >= arr[i+1]) sum += arr[i];
            else sum -= arr[i];
        }
        sum = sum+arr[s.length()-1];
        return sum;
    }
}