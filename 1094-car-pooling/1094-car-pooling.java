class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxloc=0;
        for(int[] i: trips){
            maxloc = Math.max(maxloc,i[2]);
        }
        int[] diff = new int[maxloc+1];
        for(int i=0; i<trips.length; i++){
            int l=trips[i][1];
            int r = trips[i][2];
            int x = trips[i][0];

            diff[l] += x;
           if(r<maxloc) diff[r] -= x;
        }
        int psum=0;
        for(int i: diff){
            psum += i;
            if(psum>capacity) return false;
        }
        return true;
    }
}