class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int r = s.length()-1;

        while(r>=0){
            while(r>=0 && s.charAt(r)==' ') r--;

            if(r<0) break;
            int ptr = r;
            while(r>=0 && s.charAt(r) != ' ') r--;
            if(sb.length()>0) sb.append(" ");
            sb.append(s.substring(r+1,ptr+1));
        }
        return sb.toString();
    }
}