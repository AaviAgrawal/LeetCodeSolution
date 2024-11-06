class Solution {
    public String sortVowels(String s) {
        String v = "aeiouAEIOU";
        List<Character> l = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(v.contains(c+"")) l.add(c);
        }
        Collections.sort(l);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (char c:s.toCharArray()){
            if(v.contains(c+"")) sb.append(l.get(j++));
            else sb.append(c);
        }
        return sb.toString();
    }
}