class Solution {
    public boolean isValid(String str) {
        Deque<Character> s = new ArrayDeque<>();
        for(char c: str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            } else {
                if(s.isEmpty()) return false;
                    if(c==')' && s.peek()!='(' ||
                    c==']' && s.peek()!='[' ||
                    c=='}' && s.peek()!='{')  return false;
                
            s.pop();
             }
        }
        return s.isEmpty();
    }
}