class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int c = 0,b = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) b++;
            else hm.put(secret.charAt(i),hm.getOrDefault(secret.charAt(i),0)+1);
        }
        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i) != guess.charAt(i) && hm.containsKey(guess.charAt(i))){
                c++;
                if(hm.get(guess.charAt(i)) == 1) hm.remove(guess.charAt(i));
                else hm.put(guess.charAt(i),hm.getOrDefault(guess.charAt(i),0)-1);
            }
        }
        return b+"A"+c+"B";
    }
}