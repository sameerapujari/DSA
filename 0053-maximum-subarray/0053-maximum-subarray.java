class Solution {
    public int maxSubArray(int[] nums) {
        //kadanes algo
        int sum=0, ans=Integer.MIN_VALUE; //min val reqd coz if all -ve then 0 shld not be returned not part of arr
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            ans = Math.max(ans,sum);
            if(sum<0) sum = 0;
        }
        return ans;
    }
}