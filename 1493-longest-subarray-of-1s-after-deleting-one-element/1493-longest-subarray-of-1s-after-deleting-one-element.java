class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0, n=nums.length;
        int zc = 0, l=0, r=0;
        while(r<n){
            if(nums[r]==0) zc++;
            while(zc>1){
                if(nums[l]==0) zc--;
                l=l+1;  //shrink   
            }
            ans = Math.max(ans,r-l);
            r=r+1;
        }
        return ans;
    }
}