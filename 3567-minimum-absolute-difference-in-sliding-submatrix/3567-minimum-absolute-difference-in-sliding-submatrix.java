class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        for(int i=0; i+k<=m; i++){
            for(int j=0; j+k<=n; j++){
                List<Integer> list = new ArrayList<>();
                for(int x=i; x<i+k; x++){
                    for(int y=j; y<j+k; y++){
                        list.add(grid[x][y]);
                    }
                }
                int minval = Integer.MAX_VALUE;
                Collections.sort(list);
                //get min dist adj ele
                for(int p=1; p<list.size(); p++){
                    int val = list.get(p)-list.get(p-1);
                    if(val==0) continue;
                    minval = Math.min(minval,val);
                }
                if(minval != Integer.MAX_VALUE) ans[i][j] = minval;           
             }
        }
        return ans;

    }
}