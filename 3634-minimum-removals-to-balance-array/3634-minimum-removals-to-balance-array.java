class Solution {
    public int minRemoval(int[] nums, int k) {
        //sliding window
        //ans = n - size of window
        Arrays.sort(nums);
        int n = nums.length;
        int i=0,j=0;
        int size = 0;
        while(i<n){
            while(j<n && nums[j]<=(long)k*nums[i]){
                j++;
            }
            size = Math.max(size,j-i);
            i++;
        }
        return n-size;
    }
}