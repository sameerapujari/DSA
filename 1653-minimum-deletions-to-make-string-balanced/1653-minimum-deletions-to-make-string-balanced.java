class Solution {
    public int minimumDeletions(String s) {
        //find a split point
        //then count num of b in left part and num of a in rt part
        int ans = 0;
        int bcount=0;
       for(char c: s.toCharArray()){
            if(c=='b') bcount++;
            else{
                ans = Math.min(bcount,ans+1);
            }
       }
       return ans;
    }
}