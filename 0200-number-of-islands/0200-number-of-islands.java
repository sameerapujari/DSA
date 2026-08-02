class Solution {
    public int numIslands(char[][] grid) {
        //connected 1s
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    //search for islands
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    private void dfs(char[][] grid, int r, int c){
        int m=grid.length, n=grid[0].length;

        //base case
        if(r<0 || r>=m || c<0 || c>=n || grid[r][c] == '0') return;

        //if 1 visited mark it 0 to avoid re cnt
        grid[r][c]='0';
        dfs(grid,r-1,c); //up
        dfs(grid,r+1,c); //down
        dfs(grid,r,c-1); //lft
        dfs(grid,r,c+1); //rt
    }
}