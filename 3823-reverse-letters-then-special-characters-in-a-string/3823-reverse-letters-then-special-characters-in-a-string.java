class Solution {
    public String reverseByType(String s) {
        StringBuilder chs = new StringBuilder();
        StringBuilder spl = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetter(c)) chs.append(c);
            else spl.append(c);
        }
        chs.reverse();
        spl.reverse();
        int i=0,j=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) {
                ans.append(chs.charAt(i)); i++;}
            else {ans.append(spl.charAt(j)); j++;}
        }
        return ans.toString();
    }
}