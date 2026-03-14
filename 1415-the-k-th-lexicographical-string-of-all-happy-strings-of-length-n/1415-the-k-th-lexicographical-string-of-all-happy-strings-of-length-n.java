class Solution {
    List<String> al = new ArrayList<>();
    public String getHappyString(int n, int k) {
        generate(n,"");
        Collections.sort(al);
        if(k>0 && k<=al.size()) return al.get(k-1);
        return "";
    }
    private void generate(int n, String s){
        if(s.length()==n){
            boolean valid=true;
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i)==s.charAt(i+1)){
                   valid=false;
                   break;
                }
            }
            if(valid) al.add(s);
            return;
        }
        generate(n,s+"a");
        generate(n,s+"b");
        generate(n,s+"c");
    }
}