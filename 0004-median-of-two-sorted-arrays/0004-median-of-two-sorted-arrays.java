class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       //2 pointer - O(m+n)
       //median odd - x/2, even avg (x/2 , x/2 +1) 
       //use bs logic for log tc

       //edgee caseeee
       if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
       int n=nums1.length, m=nums2.length;
       int low=0, hi= n;

       while(low<=hi){
            int par1 = (low+hi)/2;
            int par2 = (n+m+1)/2-par1;

            //check boundaries
            int l1 = par1 == 0 ? Integer.MIN_VALUE : nums1[par1-1];
            int l2 = par2 == 0 ? Integer.MIN_VALUE : nums2[par2-1];

            int r1 = par1 == n ? Integer.MAX_VALUE : nums1[par1];
            int r2 = par2 == m ? Integer.MAX_VALUE : nums2[par2];

            //check ans medians
            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    //even median
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else {
                    return (Math.max(l1,l2));
                }
            }

            //aaply BS
            else if(l1>r2) hi = par1-1;
            else low = par1+1;
       }
       return 0.0;
    }
}