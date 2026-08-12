class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        //sliding window
        Map<Integer, Integer> map = new HashMap<>();
        int l=0, r=0, ans=0, n=nums.length;
        while(r<n){
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            //window invlid
            while(map.get(nums[r])>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }

            ans = Math.max(ans,r-l+1);

            r++;
        }
        return ans;
    }
}