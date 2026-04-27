class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxLen=0;

        for(int i=0; i<s.length(); i++){
            //gen all substrs
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s.substring(i,j+1))){
                    int len = j-i+1;
                    if (len>maxLen){
                        maxLen=len;
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    private boolean isPalindrome(String st){
        int l=0, r=st.length()-1;
        while(l<=r){
            if(st.charAt(l)!=st.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}