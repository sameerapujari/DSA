class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diffarr = new int[n];
        for(int i=0; i<bookings.length; i++){
                int l=bookings[i][0], r=bookings[i][1], x=bookings[i][2];
                diffarr[l-1] += x;
                if (r<n) diffarr[r] -= x;
        }
        int[] ans = new int[n];
        ans[0]=diffarr[0];
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1]+diffarr[i];
        }
        return ans;
    }
}