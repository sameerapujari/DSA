class Solution {
    public long maxSumTrionic(int[] nums) {
        int n=nums.length;
        long ans = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            int j=i+1;
            long res=0;
            //incr
            while(j<n && nums[j-1]<nums[j])j++;
            int p=j-1;
            if(p==i)continue;

            //decr
            res += nums[p]+nums[p-1];
            while(j<n && nums[j-1]>nums[j]) {
                res += nums[j];
                j++;
            }
            int q=j-1;
            if(p==q || q==n-1 || (j<n&&nums[j]<=nums[q])){
                i=q; continue;
            }

            //incr
            res+= nums[q+1];

            long max=0;
            long sum=0;
            for(int k=q+2; k<n && nums[k]>nums[k-1]; k++){
                sum+=nums[k];
                max = Math.max(sum,max);
            }
            res+=max;

            //taget sum
            max=0;
            sum=0;
            for(int k=p-2; k>=i; k--){
                sum+=nums[k];
                max=Math.max(max,sum);
            }
            res+=max;

            ans=Math.max(ans,res);
            i=q-1;
        }
        return ans;
    }
}