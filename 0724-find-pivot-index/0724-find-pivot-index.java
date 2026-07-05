class Solution {
    public int pivotIndex(int[] nums) {
       for(int i=0; i<nums.length; i++){
        int lsum=0, rsum=0, l=0, r=nums.length-1;
        int piv=i;
        while(r>piv){
            rsum+=nums[r];
            r--;
        }
        while(l<piv){
            lsum+=nums[l];
            l++;
        }
        if(lsum==rsum){
            return piv;
        }
       }
       return -1; 
    }
}