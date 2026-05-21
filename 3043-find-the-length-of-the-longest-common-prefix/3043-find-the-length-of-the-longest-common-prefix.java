class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans=0;
        Set<Integer> set = new HashSet<>();
        //all pref in set
        for(int i: arr1){
            while(!set.contains(i) && i>0){
                set.add(i);
                i/=10;
            }
        }
        //validate pref 
        for(int num: arr2){
            while(num>0){
                int ele = num, dig=0;
                if(set.contains(num)){
                   while(ele>0){
                    ele /= 10;
                    dig++;
                   }
                }
                num /= 10;
                ans = Math.max(ans,dig);
            }
        }
        return ans;
    }
}