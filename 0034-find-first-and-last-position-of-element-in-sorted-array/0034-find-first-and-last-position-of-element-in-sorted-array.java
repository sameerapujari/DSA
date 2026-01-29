class Solution {
    public int[] searchRange(int[] nums, int target) {
        //bs - tc: O(log n)
        int[] ans = {-1,-1};
        if(nums.length==0) return ans;
        if (nums.length == 0) return ans;

        ans[0] = firstInd(nums, target);
        if (ans[0] == -1) return ans;
        ans[1] = lastInd(nums, target);

        return ans;
        
    }
    private int firstInd(int[] nums, int x){
        int l=0, h=nums.length-1, res=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==x) {res = m;
             h=m-1;}
            else if(nums[m]<x) l=m+1;
            else h=m-1;
        }
        return res;
    }
    private int lastInd(int[] nums, int x){
        int l=0, h=nums.length-1, res=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==x){ res=m;
            l = m+1;}
            else if(nums[m]<x)l=m+1;
            else h=m-1;
        }
        return res;
    }
}