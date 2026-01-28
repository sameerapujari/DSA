class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       //2 pointer 
       //final size of merged arr: m+n 
       //median odd - x/2, even avg (x/2 , x/2 +1) 
        int m = nums1.length, n = nums2.length;
        int x = m + n;

        int p1 = 0, p2 = 0;
        int cnt = 0;

        int prev = 0, curr = 0;

        while (cnt <= x / 2) {
            prev = curr;

            if (p1 < m && (p2 >= n || nums1[p1] <= nums2[p2])) {
                curr = nums1[p1++];
            } else {
                curr = nums2[p2++];
            }
            cnt++;
        }

        if (x % 2 == 0)
            return (curr + prev) / 2.0; 
        else
            return curr;

       
    }
}