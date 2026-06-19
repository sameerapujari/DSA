class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //lol this q is tagged for BS

        // int m = matrix.length;
        // int n = matrix[0].length;
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        // return false;

        //BS
        //flatten out the matrix then fig out mat index to arr index mapping
        int m = matrix.length, n=matrix[0].length;
        int l=0, h=(m*n)-1;

        while(l<=h){
            int mid = l + (h-l)/2;
            int val = matrix[mid/n][mid%n]; // most impppp
            if(val==target) return true;
            else if(val>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}