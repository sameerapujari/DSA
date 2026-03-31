class Solution {
    public int findKthPositive(int[] arr, int k) {
        //list is 0 based return k-1
        List<Integer> list = new ArrayList<>();
        int  j=0;
        for(int i=1; list.size()<=1000; i++){
            if(j<arr.length && i==arr[j]){
                j++;
            }else{
                list.add(i);
            }
        }
        return list.get(k-1);
    }
}