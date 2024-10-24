class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int i = 0;
        int j = s.length()-1;
        if(s.equals(goal)){
            Set<Character> hs = new HashSet<>();
            for(char c:s.toCharArray()){
                hs.add(c);
            }
            return hs.size() < s.length();
        }
        while (i<j && s.charAt(i) == goal.charAt(i)) i++;
        while (i<j && s.charAt(j) == goal.charAt(j)) j--;
        if(i<j){
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            s = new String(arr);
        }
        return s.equals(goal);
    }
}