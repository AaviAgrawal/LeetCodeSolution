class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> v = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String r = "";
        int i=1;
        for(String w:sentence.split("\\s")){
            r = r + " " + (v.contains(w.charAt(0)) ? w : w.substring(1)+w.charAt(0))+"ma";
            for(int j=1;j<=i;j++){
                r = r+"a";
            }
            i++;
        }
        return r.substring(1);
    }
}