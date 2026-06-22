class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans = new ArrayList<>(); 
        int cnt1=0, cnt2=0;
        int ele1=nums[0], ele2=nums[0];
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i]; 
            } else if (cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i]; 
            } else if (nums[i] == ele1) {
                cnt1++;
            } else if (nums[i] == ele2) {
                cnt2++; 
            } else {
                cnt1--; 
                cnt2--;
            }
        }

        //2nd pass
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }
        int min = n / 3 + 1;
        if (cnt1 >= min) ans.add(ele1);
        if (cnt2 >= min && ele1 != ele2) ans.add(ele2);
        return ans;
    }
}