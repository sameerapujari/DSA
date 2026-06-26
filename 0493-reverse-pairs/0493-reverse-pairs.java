class Solution {
    public int reversePairs(int[] nums) {
        //Int_MAX = 2147483647 N^2 will tle
        //tc needed: n log n

        return mergeSort(nums,0,nums.length-1);
    }
    private int mergeSort(int[] nums, int l, int r){
        if(l>=r) return 0;  //base case
        
        int mid = l+(r-l)/2;
        int count = mergeSort(nums,l,mid);
        count += mergeSort(nums,mid+1,r);

        //count pairs logic:
        int j = mid+1;
        for(int i=l; i<=mid; i++){
            while(j<=r && (long)nums[i]>2L*nums[j]) j++;  //compare l arr and r arr

            count += (j-(mid+1));
        }
        //merge back
        merge(nums,l,mid,r);
        return count;
    }
    private void merge(int[] nums, int l, int m, int r){
        int[] temp = new int[r-l+1];
        int i=l, j=m+1, k=0;

        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            } else temp[k++] = nums[j++];
        }

        //add the leftovers
        while(i<=m) temp[k++] = nums[i++];
        while(j<=r) temp[k++] = nums[j++];

        //copy back into nums
        for(int p=0; p<temp.length; p++){
            nums[l+p] = temp[p];
        }
    }
}