class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0, n=nums.length;
        int x = 0; boolean nonz=false;
        
        for(int i: nums){
            if(i!=0) nonz = true;
            x ^= i;
        }
        if(x !=0) ans = n;
        else{
            //x==0 2 cases
           //look for atleast 1 non 0 ele
           if(nonz == false) ans=0;
           else ans=n-1;
        }
        return ans;
    }
}