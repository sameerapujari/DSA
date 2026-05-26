class Solution {
    public int numberOfSpecialChars(String word) {
//         //use sets
//         HashSet<Character> lower = new HashSet<>();
//         HashSet<Character> upper = new HashSet<>();
//         int count=0;

// //duplicates gone
//         for(int i=0; i<word.length(); i++){
//             char c = word.charAt(i);
//             if(Character.isLowerCase(c)) lower.add(c);
//             else upper.add(Character.toLowerCase(c));
//         }
//         for(char c: lower){
//             if(upper.contains(c))count++;
//         }
//         return count;

            boolean[] lower = new boolean[26];
            boolean[] upper = new boolean[26];

            for(char c: word.toCharArray()){
                if(Character.isLowerCase(c)) lower[c-'a'] = true;
                else upper[c-'A'] = true;
            }
            int count=0;
            for(int i=0; i<26; i++){
                if(lower[i] && upper[i])count++;
            }
            return count;
    }
}