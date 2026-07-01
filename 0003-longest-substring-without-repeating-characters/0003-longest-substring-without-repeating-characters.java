class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int l=0;
        int[] freq = new int[128];
        for(int r=0; r<n; r++){
            freq[s.charAt(r)]++;
           while(freq[s.charAt(r)]>1){
                freq[s.charAt(l)]--;
                l++;
           }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}