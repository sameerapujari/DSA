class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hi=0,low=1;
        //find max- which is high val for bs
        for(int i:piles){
            if(i>hi) hi=i;
        }

        //bs on low to high
        while(low<=hi){
            long tothrs=0;
            int mid = low +(hi-low)/2;
            for(int i:piles){
                tothrs += Math.ceil((double)i/mid);
            }
            if(tothrs<=h){
                //find lower bounddd
                hi=mid-1;
            }else low=mid+1;
        }
        //dry run low is where ans is
        return low;
    }
}