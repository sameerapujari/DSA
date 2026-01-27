class Solution {
    int single(int[] arr) {
        // code here
        int ans = 0;
        
        for(int i: arr){
            ans ^= i;
        }
        return ans;
    }
}