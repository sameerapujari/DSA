class Solution {
    public int pivotIndex(int[] nums) {
    int tot=0, lsum=0;
    for(int i:nums) tot+=i;

        for(int i=0; i<nums.length; i++){
            int rsum = tot-lsum-nums[i];
            if(lsum == rsum) return i;
            lsum += nums[i];
        }
       return -1; 
    }
}