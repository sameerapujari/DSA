class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0, hi=0;
        for(int i:weights){
            if(i>low) low=i;
            hi+=i;
        } 
        while(low<=hi){
            int mid=low+(hi-low)/2;
            int reqd = calcdays(weights,mid);
            if(reqd<days) hi=mid-1;  //this means more least ans exists
            else low=mid+1;
        }
        return low;
    }
    private int calcdays(int[] wts, int cap){
        int load=0, day=0;
        for(int w:wts){
            load+=w;
            if(load>cap){
                load = w;
                day++;
            }
        }
        return day;
    }
}