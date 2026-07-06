class Solution {
    public int pivotIndex(int[] nums) {
    int tot=0;
    for(int i:nums) tot+=i;
    int[] ps = new int[nums.length];
    ps[0]=nums[0];
    //build ps array
        for(int i=1; i<nums.length; i++){
           ps[i] = ps[i-1] + nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int lsum = (i==0)? 0 : ps[i-1];
            int rsum = tot-ps[i];
            if(lsum == rsum) return i;
        }
       return -1; 
    }
}