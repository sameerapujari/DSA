class Solution {
    public int beautySum(String s) {
        //prefixx summm - optimal
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int beauty = getMinMax(s.substring(i,j+1));
                ans += beauty;
            }
        }
        return ans;
    }
    private int getMinMax(String str){
        int[] freq = new int[26];
         for(char c: str.toCharArray()){
            freq[c-'a']++;
         }
         int min=Integer.MAX_VALUE, max=0;
         for(int i: freq){
            if(i>0){
                if(i>max)max=i;
                if(i<min)min=i;
            }
         }
         return max-min;
    }
}