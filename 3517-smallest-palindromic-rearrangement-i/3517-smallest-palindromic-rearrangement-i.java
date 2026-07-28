class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] s1 = new char[mid];
        for(int i=0; i<mid; i++){
            s1[i] = s.charAt(i);
        }
        Arrays.sort(s1);
        char[] s2 = s1.clone();
        for(int i=0,j=mid-1; i<j; i++,j--){
            char t = s2[i];
            s2[i] = s2[j];
            s2[j] = t;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<mid; i++){
            sb.append(s1[i]);
        }
        if (n % 2 == 1) {
            sb.append(s.charAt(mid));
        }
         for(int i=0; i<mid; i++){
            sb.append(s2[i]);
        }
        return sb.toString();
    }
}