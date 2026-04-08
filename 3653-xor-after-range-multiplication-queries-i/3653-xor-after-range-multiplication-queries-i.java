class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int q = queries[0].length;
        int mod = 1000000007;

        for(int i=0; i<n; i++){
            int idx = queries[i][0];
            int j = queries[i][1];
            while(idx<=j){
                nums[idx] = (int)(((long)nums[idx]*queries[i][3])%mod);
                idx += queries[i][2];
            }
        }
        int ans = 0;
        for(int i: nums){
            ans ^= i;
        }
        return ans;
    }
}