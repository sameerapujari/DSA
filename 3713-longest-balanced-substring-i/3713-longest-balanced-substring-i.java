class Solution {
    public int longestBalanced(String s) {
        //key insight: k-num of distinct, freq of each ... ans is len=freq*k
        int ans = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            int[] freq = new int[26];
            int cnt=0, max=0;
            for(int j=i; j<n; j++){
                int idx = s.charAt(j)-'a';
                if(freq[idx]==0) cnt++;
                    freq[idx]++;
                    max = Math.max(max,freq[idx]);

                    if((j-i+1) == (cnt*max)){
                        ans = Math.max(ans,j-i+1);
                    }
            }
        }
        return ans;
    }
}