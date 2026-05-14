class Solution {
    public boolean isGood(int[] nums) {
        int n=0;
        for(int i: nums){
            if(i>n) n=i;
        }
        if(nums.length != n+1) return false;
        int[] freq = new int[n+1];
        for(int i: nums){
            if(i<1 || i>n) return false;
            freq[i]++;
        }    
          for(int i=1; i<n; i++){
            if(freq[i]!=1) return false;
          }  
        return true;
    }
}