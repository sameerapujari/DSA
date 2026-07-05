class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        for(int i:nums) tot+=i;
       for(int i=0; i<nums.length; i++){
        int lsum=0, l=0;
        int piv=i;
            while(l<piv){
                lsum+=nums[l];
                l++;
            }
            if(lsum==(tot-lsum-nums[piv])){
                return piv;
            }
       }
       return -1; 
    }
}