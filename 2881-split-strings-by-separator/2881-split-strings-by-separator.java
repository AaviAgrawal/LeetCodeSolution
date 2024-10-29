class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> r = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String[] arr = words.get(i).split("["+separator+"]");
            for(int j=0;j<arr.length;j++){
                if(arr[j].length() > 0) r.add(arr[j]);
            }
        }
        return r;
    }
}