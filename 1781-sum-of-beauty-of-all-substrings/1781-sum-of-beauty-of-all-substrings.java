class Solution {
    public int beautySum(String s) {
        //prefixx summm - optimal
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            int[] freq = new int[26];
            for(int j=i; j<n; j++){
               freq[s.charAt(j)-'a']++;

               int max=0, min=Integer.MAX_VALUE;
               for(int f: freq){
                if(f>0){
                    if(f>max)max=f;
                    if(f<min)min=f;
                }
               }
               ans += max-min;
            }
        }
        return ans;
    }
}