class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res=0, psum=0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            psum += nums[i];
            if(map.containsKey(psum-k)) res+=map.get(psum-k);
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return res;
    }
}