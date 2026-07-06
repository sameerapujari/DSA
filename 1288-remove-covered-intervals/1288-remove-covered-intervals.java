class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //we need to sort the arr 1stt use crct sorting order
        //tc o n2 but need sorting to dominate o nlogn

    //     Arrays.sort(intervals, (a, b) -> {
    //     if (a[0] == b[0])
    //         return Integer.compare(b[1], a[1]);  //desc
    //     return Integer.compare(a[0], b[0]);  //asc
    // });

    //     int n = intervals.length;
    //     int cnt=n;  //coz they want rem to be returned
    //     for(int i=n-1; i>=0; i--){
    //         for(int j=0; j<i; j++){
    //             if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]) {
    //                 cnt--; break;
    //             }
    //         }
    //     }
    //     return cnt;

        int cnt=0;
        for(int i=0; i<intervals.length; i++){
            boolean check=false;
            for(int j=0; j<intervals.length; j++){
                if(i==j) continue;
                if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]) {
                    check = true;
                    break;
                }
            }
            if(!check) cnt++;
        }
        return cnt;
    }
}