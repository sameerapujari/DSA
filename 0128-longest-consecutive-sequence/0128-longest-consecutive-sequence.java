class Solution {
    public int longestConsecutive(int[] nums) {
        //tc - O(n)
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for(int i: nums) set.add(i);

        for(int curr: set){
            if(!set.contains(curr-1)){
                int cnt=1;
                int start=curr;

                while(set.contains(start+1)){
                    cnt++;
                    start=start+1;
                }
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}