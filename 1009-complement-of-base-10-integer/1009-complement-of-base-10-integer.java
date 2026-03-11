class Solution {
    public int bitwiseComplement(int n) {
        // if (n==0) return 1;
        // String bin = Integer.toBinaryString(n);
        // StringBuilder sb = new StringBuilder();
        // for(char c:bin.toCharArray()){
        //     if(c=='0')sb.append(1);
        //     else sb.append(0);
        // }
        // int ans = Integer.parseInt(sb.toString(),2);
        // return ans;
        //optimal: xor ^1
        //mask = bits + flipped bits
        if(n==0) return 1;
        int mask=1;
        while(mask<=n){
            mask=mask<<1;
        }
        return (mask-1)^n;
    }
}