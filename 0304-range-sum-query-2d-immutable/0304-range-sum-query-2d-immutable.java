class NumMatrix {
    
//derive the formula for 2d: 
//p[r][c] = p[r-1,c] top +p[r,c-1] left - overlap p[r-1,c-1]

    int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m=matrix.length, n = matrix[0].length;
        prefix = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // this will just return queries ans in O(1) time 
        return prefix[row2+1][col2+1] - prefix[row1][col2+1] - prefix[row2+1][col1] + prefix[row1][col1];
        //whole-top-left+overlap
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */