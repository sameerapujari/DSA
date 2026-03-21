class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=x,j=x+k-1; i<j; i++,j--){
            for(int z=y; z<y+k; z++){
                int temp = grid[i][z];
                grid[i][z] = grid[j][z];
                grid[j][z] = temp;
            }
        }
        return grid;
    }
}