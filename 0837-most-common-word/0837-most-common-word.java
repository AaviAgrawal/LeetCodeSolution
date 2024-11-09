class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] s = paragraph.toLowerCase().split("[ !?',;.]+");
        for(String i:s) hm.put(i, hm.getOrDefault(i,0)+1);
        for (String i:banned) if(hm.containsKey(i)) hm.remove(i);
        String r = null;
        for(String i:hm.keySet()) if(r == null || hm.get(i) > hm.get(r)) r = i;
        return r;
    }
}