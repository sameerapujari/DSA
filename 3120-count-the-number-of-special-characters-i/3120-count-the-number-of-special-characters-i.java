class Solution {
    public int numberOfSpecialChars(String word) {
        //use sets
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        int count=0;

//duplicates gone
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(Character.isLowerCase(c)) lower.add(c);
            else upper.add(Character.toLowerCase(c));
        }
        for(char c: lower){
            if(upper.contains(c))count++;
        }
        return count;
    }
}