class Solution {
    public int arrangeCoins(int n) {
        //k complete rows will have c*(c+1)/2 coins
        int l=1, hi=n;
        while(l<=hi){
            int m = l+(hi-l)/2;
            long coins = (long) m*(m+1)/2;
            if(coins==n) return m;
            else if(coins>n) hi=m-1;
            else l=m+1;
        }
        return hi;
    }
}