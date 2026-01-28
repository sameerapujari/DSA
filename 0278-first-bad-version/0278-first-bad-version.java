/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //goal minimize the num of calls to api
        //binary search the version space
        int calls = 0;
        int low=0, high=n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(!isBadVersion(mid)){
                low = mid+1;
            }
            else high = mid-1;
        }
        return low;

    }
}