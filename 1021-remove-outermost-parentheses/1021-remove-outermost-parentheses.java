class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ctr=0;
        for(char c: s.toCharArray()){
            if(c == '('){
                if(ctr>0) sb.append(c);
                ctr++;
            }
            else {
                ctr--;
                if(ctr>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}