class Solution {
    public int findMin(int[] nums) {
        int l=0, hi=nums.length-1;
        while(l<hi){
            int mid = l+(hi-l)/2;
            if(nums[mid]>nums[hi]){
                //go right
                l=mid+1;
            }else{
                hi=mid;
            }
        }
        return nums[l];
    }
}