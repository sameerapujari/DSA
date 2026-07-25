class Solution {
    public int maxProduct(int n) {
        int maxprod = 1;
        int f=0, s=0;
        while(n>0){
            int a=n%10;
            if(a>f) {s=f; f=a;}
            else if(a>s) s=a;
             n/=10;
        }
       return f*s;
    }
}