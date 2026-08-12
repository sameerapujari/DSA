class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, ans=0,n=nums.length, cnt=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0) cnt++;
            while(cnt>k){
                if(nums[l]==0) cnt--;
                l++;
            }
            ans= Math.max(ans,r-l+1);
        }
        return ans;
    }
}