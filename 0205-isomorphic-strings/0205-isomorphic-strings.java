class Solution {
    public boolean isIsomorphic(String s, String t) {
        //brute O(n2)
        //better - 2 hashmaps
        // key is that ---- compare 1st occurance indicesss if same or not
        //u need unique mapping of each char from s->t
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            //put 1st occur of chars indx in m1 
            if(!m1.containsKey(s.charAt(i))){
                m1.put(s.charAt(i),i);
            }
            if(!m2.containsKey(t.charAt(i))){
                m2.put(t.charAt(i),i);
            }

            //now for each char see if idx matches
            if(m1.get(s.charAt(i)) != m2.get(t.charAt(i))) return false;
        }
        return true;
    }
}