class Solution {
    public String compressedString(String word) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word.length()){
            char c = word.charAt(i);
            int count = 0;
            while (i < word.length() && c == word.charAt(i) && count < 9){
                i++;
                count++;
            }
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}