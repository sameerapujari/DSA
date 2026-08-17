class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2=nums2.length;
        int[] ans = new int[n1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(nums1[i]==nums2[j]) ans[i] = findNGE(nums2,j);
            }
        }
        return ans;
    }
    private int findNGE(int[] arr, int idx){
        //this fn will find the nge for nums2 arr helper fn really

        Deque <Integer> st = new ArrayDeque<>();
        for(int i=arr.length-1; i>=idx; i--){
            while(!st.isEmpty() && arr[i] >= st.peek()) st.pop();
            if(i==idx) return st.isEmpty()? -1: st.peek();
            st.push(arr[i]);
        }
        return -1;
    }
}