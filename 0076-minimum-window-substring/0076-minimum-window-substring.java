class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int l=0, r=0, c=0, min=Integer.MAX_VALUE, start=0;

        //preinsert t
        for(char ch: t.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

        //sliding windoww
        while(r<s.length()){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch)>0) c++;
                map.put(ch,map.get(ch)-1);
            }

            //minLen windoww
            while(c==t.length()){
                if(r-l+1<min){
                    min=r-l+1;
                    start=l;
                }

                //shrink windowww
                char lh = s.charAt(l);
                if(map.containsKey(lh)){
                    map.put(lh,map.get(lh)+1);
                if(map.get(lh)>0) c--;
                }
                l++;
            }
            r++;
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}