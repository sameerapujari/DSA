class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ctr=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(ctr>0) sb.append(s.charAt(i));
                ctr++;
            }
            else {
                ctr--;
                if(ctr>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}