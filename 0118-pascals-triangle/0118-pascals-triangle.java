class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();

       for(int i=0; i<numRows; i++){
            ans.add(generateRow(i));
       }
       return ans;
    }
    private List<Integer> generateRow(int row){
        int val = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int col=1; col<=row; col++){
            val = val*(row-col+1);
            val = val/col;
            list.add(val);
        }
        return list;
    }
}