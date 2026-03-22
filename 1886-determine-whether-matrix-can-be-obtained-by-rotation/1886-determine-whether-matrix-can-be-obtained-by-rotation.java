class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0; k<4; k++){
            rotate(mat);
            if(isEqual(mat,target)){
            return true;
        }
        }
        
        return false;
    }
    private int[][] rotate(int[][] mat){
        //transpose
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]=temp;
            }
        }
        //rev cols
        for(int i=0; i<n; i++){
            int t=0, b=n-1;
            while(t<b){
                int temp=mat[t][i];
                mat[t][i] = mat[b][i];
                mat[b][i] = temp;
                t++;
                b--;
            }
        }
        return mat;
    }
    private boolean isEqual(int[][] mat, int[][] target){
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}