class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length, l=0, r=0, sum=0;
        while(r<n){
            sum += nums[r];
            if(r-l+1>k){
                sum -= nums[l]; l++;
            }
            if(r-l+1 == k){
                ans = Math.max(ans,sum);
            }
            r++;
        }
        return (double)ans/k;
    }
}