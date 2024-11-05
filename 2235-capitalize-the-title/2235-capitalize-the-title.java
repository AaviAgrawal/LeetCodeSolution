class Solution {
    public String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String i:s){
            if(i.length() <= 2) i = i.toLowerCase();
            else i = i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase();
            sb.append(i+" ");
        }
        return sb.toString().trim();
    }
}