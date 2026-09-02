class Solution {
    public int orangesRotting(int[][] grid) {
        //need to explore level wise the neighbors also mult can rot at same time
        //need multi src BFS 
        //2 or more start rotting simultaneously

        int row = grid.length, col=grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();

        //put 2s into q and cnt total 1s
        int fcnt=0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                else if(grid[i][j]==1) fcnt++;
            }
        }

        int ans=0;
        //4 adj dirs
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        //multi src BFS
        while(!q.isEmpty() && fcnt>0){
            //fix curr level curr rotten 
            int lev = q.size();

            for(int i=0; i<lev; i++){
                int[] cur = q.poll();
                int r=cur[0], c=cur[1];

                //exp level neighbr
                for(int d[]: dirs){
                    int nr = r+d[0], nc=c+d[1];

                    if(nr<0 || nc<0 || nr>=row || nc>=col) continue;  //invlaid out of grid

                    if(grid[nr][nc] == 1){
                        //mark new rot
                        grid[nr][nc] = 2;
                        fcnt--;  //fresh ones gone
                        //add to our q
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            ans++;
        }
        return fcnt == 0? ans: -1;
    }
}