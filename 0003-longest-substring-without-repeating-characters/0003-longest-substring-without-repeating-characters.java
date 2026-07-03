class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] lastseen = new int[256];  //ascii
        Arrays.fill(lastseen,-1);  //initialize
        int l=0;

        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            l = Math.max(l,lastseen[ch]);
            ans=Math.max(ans,r-l+1);
            lastseen[ch]=r+1;
        }
        return ans;
    }
}