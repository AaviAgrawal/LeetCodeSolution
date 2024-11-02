class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] sen = sentence.split(" ");
        for(int i=0;i<sen.length-1;i++){
            if(sen[i].charAt(sen[i].length()-1) != sen[i+1].charAt(0)) return false;
        }
        return sen[sen.length-1].charAt(sen[sen.length-1].length()-1) == sen[0].charAt(0);
    }
}