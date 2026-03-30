class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[]s1eve = new int[26]; 
        int[]s1odd = new int[26]; 
        int[]s2eve = new int[26]; 
        int[]s2odd = new int[26];  

        for(int i=0; i<s1.length(); i++){
            if(i%2==0){
                s1eve[s1.charAt(i)-'a']++;
                s2eve[s2.charAt(i)-'a']++;
            } else{
                s2odd[s2.charAt(i)-'a']++;
                s1odd[s1.charAt(i)-'a']++;
            }
        } 
        //check both arrs T if eql
        for(int i=0; i<26; i++){
            if(s1eve[i]!=s2eve[i]) return false;
            if(s1odd[i]!=s2odd[i]) return false;
        }
        return true;
    }
}