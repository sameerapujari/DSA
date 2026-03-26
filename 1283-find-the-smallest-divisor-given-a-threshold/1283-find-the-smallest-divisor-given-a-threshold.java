class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //to round- use math.ceil
        int low=1,hi=0;
        
        for(int i:nums){
            if(i>hi) hi=i;
        }

        while(low<=hi){
            int sum=0;
            int mid= low+(hi-low)/2;
            for(int i: nums){
                sum += (int) Math.ceil((double)i/mid);
            }
            if(sum>threshold) low=mid+1;
            else hi=mid-1;
        }
        return low;
    }
}