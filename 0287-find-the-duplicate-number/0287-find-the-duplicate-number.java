class Solution {
    public int findDuplicate(int[] nums) {

        //binary search on nums range-- 1 to n only
        //pigeonhole principle
        //tc - O(nlogn) sc - O(1)
        // int l=1, h=nums.length;
        
        // while(l<h){
        //     int mid = l+(h-l)/2;
        //     int count=0;  //keep a count of ele < mid to narrow search space
        //     for(int x:nums){
        //         if(x<=mid)count++;
        //     }
        //     if(count>mid){
        //         h=mid;
        //     }
        //      else l = mid+1;
        // }
        // return l;

        //floyds cycle detection solution
        //tc-O(n) sc-O(1)
        int slow=nums[0], fast=nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}