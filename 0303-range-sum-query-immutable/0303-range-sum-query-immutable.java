class NumArray {
    private int[] psum;
    public NumArray(int[] nums) {
        //the building ps arr goes here
        //tc on(n)
        int n = nums.length;
        psum = new int[n];
        psum[0] = nums[0];
        for(int i=1; i<n; i++){
            psum[i] = psum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        //the query goes here
        //tc O(1)
        if(left==0) return psum[right];
        return psum[right] - psum[left-1];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */