class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if (e.getValue() > (n/3)){
                list.add(e.getKey());
            }
        }
        return list;
    }
}