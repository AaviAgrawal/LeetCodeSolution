/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=0,e=n;
        while(e-s>1){
            int mid = s+(e-s)/2;
            if(isBadVersion(mid)) e=mid;
            else s=mid;
        }
        return e;
    }
}