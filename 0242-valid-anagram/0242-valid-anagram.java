class Solution {
    public boolean isAnagram(String s, String t) {
        //use freq counting technique
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
//check if they cancelled out
        for(var ch:map.entrySet()){
            if(ch.getValue()!=0) return false;
        }
        return true;
    }
}