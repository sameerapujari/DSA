class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int cntDrops = 0;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]) cntDrops++;
        }
        if (nums[n-1] > nums[0]) {
            cntDrops++;
        }
       return cntDrops <= 1;
    }
}