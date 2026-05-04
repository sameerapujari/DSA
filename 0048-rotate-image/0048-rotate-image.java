class Solution {
    public void rotate(int[][] matrix) {
        //clockwise: transpose+reverse rows
        //anti: trans+reverse cols

        int n=matrix.length;
        //transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse rows
        for(int i=0; i<n; i++){
            int l=0, r=n-1;
            while(l<r){
                int t=matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
                l++;
                r--;
            }
        }
    }
}