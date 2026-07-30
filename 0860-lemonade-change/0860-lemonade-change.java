class Solution {
    public boolean lemonadeChange(int[] bills) {
        //perfect grredy 20 = 10+5 OR 3 5$
        int p=0, q=0;
        for(int i: bills){
            if(i==5) p++;
            else if(i==10){
                if(p==0) return false;
                p--;
                q++;
            } else{
                //for 20 check 1st if 10+5
                if(p>0 && q>0){
                    p--; q--;
                } else if(p>=3){
                    p-=3;
                } else return false;
            }
        }
        return true;
    }
}