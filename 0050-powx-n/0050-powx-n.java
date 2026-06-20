class Solution {
    public double myPow(double x, int N) {
        //now most imp edge case when u conv last INT_MIN to +ve its int overflow
        //hence use long
        //neg expo

        long n = N;
        if(n<0) return 1.0/calcPow(x,-n);
        return calcPow(x,n);
    }
    private double calcPow(double x, long n){
        //will use recursion d&c approach
        //base case
        if(n==0) return 1.0;
        if(n==1) return x;

        if(n%2==0){  //even power
            return calcPow(x*x,n/2);
        }
        return x*calcPow(x,n-1);  //odd power
    }
}