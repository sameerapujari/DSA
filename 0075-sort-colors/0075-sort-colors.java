class Solution {
    public void sortColors(int[] nums) {
        //3 ptrs
        int n = nums.length;
        int l=0, m=0, h=n-1;
        while(m<=h){
            //for 0
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            //for 1
            else if(nums[m]==1) m++;
            //for 2
            else {
                swap(nums,h,m);
                h--;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}