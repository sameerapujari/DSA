class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE, max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        for(int i:nums){
            min = Math.min(i,min);
            max = Math.max(max,i);
        }
        for(int i=min; i<=max; i++){
            if(!set.contains(i)) list.add(i);
        }
         return list;
    }
}