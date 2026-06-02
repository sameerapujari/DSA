class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;  //piv may or maynot exist
        int n=nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot!=-1){
            //we need a sawp n reverse
            //smallest ele in rigth hald
            for(int i=n-1; i>pivot; i--){
                if(nums[i]>nums[pivot]){
                    swap(nums,i,pivot);
                    break;
                }
            }
        }
        //else always reverse
        reverse(nums,pivot+1);
    }
    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums, int i){
        int l=i, r=nums.length-1;
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}