class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        //we can store all substrgs in hashset too
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            for(int j=i+1; j<=word.length(); j++){
                set.add(word.substring(i,j));
            }
        }
        for(String s: patterns) {
            if(set.contains(s)) count++;
        }
        return count;
    }
}