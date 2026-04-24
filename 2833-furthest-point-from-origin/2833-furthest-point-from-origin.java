class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a=0,b=0,c=0;
        for(char ch: moves.toCharArray()){
            if(ch == 'L') a++;
            else if(ch=='R')b++;
            else c++;
        }
        return Math.abs(a-b)+c;
    }
}