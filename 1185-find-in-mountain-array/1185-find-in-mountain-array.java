/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int findPeak(MountainArray mountainArr){
        int s = 0;
        int e = mountainArr.length()-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) e = mid;
            else s = mid+1;
        }
        return s;
    }
    int searchArr(MountainArray mountainArr,int target,int s,int e,boolean a){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mountainArr.get(mid) == target) return mid;
            if(a){
                if(mountainArr.get(mid) > target) e = mid-1;
                else s = mid+1;
            }else{
                if(mountainArr.get(mid) > target) s = mid+1;
                else e = mid-1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int firstTry = searchArr(mountainArr,target,0,peak,true);
        if(firstTry != -1){
            return firstTry;
        }
        return searchArr(mountainArr,target,peak+1,mountainArr.length()-1,false);
    }
}