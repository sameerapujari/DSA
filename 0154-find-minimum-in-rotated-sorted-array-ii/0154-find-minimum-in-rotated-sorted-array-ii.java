class Solution {
    public int findMin(int[] nums) {
        //note:
//You must decrease the overall operation steps as much as possible.

       int low=0, high=nums.length-1; 
       while(low<high){
        int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]) low=mid+1;
            else if(nums[mid]<nums[high])high=mid;
            else high--;  //mid==hi
       }
       return nums[low];
    }
}