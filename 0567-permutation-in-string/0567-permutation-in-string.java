class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        Arrays.fill(f1,-1);
        Arrays.fill(f2,-1);

        for(char c: s1.toCharArray()){
            f1[c-'a']++;
        }

        int l=0, r=0, n=s1.length();
        while(r<s2.length()){
            f2[s2.charAt(r)-'a']++;

            //window size =
            if(r>=n){
                //invalid
                f2[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(f1,f2)) return true;
            r++;
        }
        return false;
    }
}