class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int x = nums[i];
            if(map.containsKey(x)){
                ans = Math.min(ans,i-map.get(x));
            }
            map.put(reverse(x),i);
            }
         return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = rev*10 + (n%10);
            n /= 10;
        }
        return rev;
    }
}