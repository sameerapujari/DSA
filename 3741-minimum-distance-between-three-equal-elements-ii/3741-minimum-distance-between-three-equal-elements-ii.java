class Solution {
    public int minimumDistance(int[] nums) {
         //brute force wil be O(n3)
        Map<Integer, List<Integer>> map = new HashMap<>();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            List<Integer> list = map.get(nums[i]);
            list.add(i);
            if (list.size() >= 3) {
                int n = list.size();
                int i1 = list.get(n - 3);
                int i3 = list.get(n - 1);
                res = Math.min(res, 2 * (i3 - i1));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}