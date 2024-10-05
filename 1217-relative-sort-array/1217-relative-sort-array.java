class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i: arr1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int index = 0;
        for(int i: arr2){
            int count = hm.getOrDefault(i,0);
            for(int j = 0;j<count;j++){
                res[index] = i;
                index++;
            }
            hm.remove(i);
        }
        int[] rem = new int[arr1.length-index];
        int index2 = 0;
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                int c = hm.getOrDefault(arr1[i],0);
                for(int j=0;j<c;j++){
                    rem[index2] = arr1[i];
                    index2++;
                }
                hm.remove(arr1[i]);
            }
        }
        Arrays.sort(rem);
        for(int i=0;i<rem.length;i++){
            res[index] = rem[i];
            index++;
        }
        return res;
    }
}