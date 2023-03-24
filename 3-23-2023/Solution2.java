/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bottom = 0;
        int top = n;
        while (bottom <= top){
            int mid = bottom + (top-bottom)/2;
            if (isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid;
            }
            if (!isBadVersion(mid)){
                bottom = mid + 1;
            }
            else{
                top = mid;
            }
        }
        return -1;
    }
}