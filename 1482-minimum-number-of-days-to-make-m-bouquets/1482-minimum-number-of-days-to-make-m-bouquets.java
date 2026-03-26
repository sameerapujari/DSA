class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total = (long)m * k;  //can overflowww
        if (total > bloomDay.length) return -1;

        int low=Arrays.stream(bloomDay).min().getAsInt();
        int hi=Arrays.stream(bloomDay).max().getAsInt();

        //bs
        while(low<=hi){
            int mid = low+(hi-low)/2;
                if(possible(bloomDay,mid,m,k)) hi=mid-1;
                else low=mid+1;
            }
        return low;
    }
    private boolean possible(int[] bloomday, int day, int m, int k){
        int cnt=0, bq=0;
            for(int i:bloomday){
                if(i<=day){
                    cnt++;
                    if(cnt==k){
                        bq++;
                        cnt=0;
                    }
                }else cnt=0;
    }
    return (bq>=m);
    }
}