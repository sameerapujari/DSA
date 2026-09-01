class Solution {
    public int missingNumber(int[] nums) {
        int xor=0, n=nums.length, actxor=0;
        for(int i=0; i<=n; i++){
            xor ^= i;
        }
        for(int i: nums){
            actxor ^= i;
        }
        return xor^actxor;
    }
}