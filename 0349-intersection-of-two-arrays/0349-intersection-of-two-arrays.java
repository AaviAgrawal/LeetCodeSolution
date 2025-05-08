class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l = 0;
        int r = 0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l] == nums2[r]){
                s.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l] > nums2[r]) r++;
            else l++; 
        }
        int[] res = new int[s.size()];
        int j = 0;
        for(int i:s){
            res[j++] = i;
        }
        return res;
    }
}