class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        //dev board
        char[][] board = new char[n][n];
        for(char[] row: board){
            Arrays.fill(row,'.');
        }

        solve(board,0,n);

        return res;
    }

    private void solve(char[][] board, int row, int n){
        //base case
        if(row==n){
            res.add(addBoardState(board));
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col,n)){
                //place Q
                board[row][col] = 'Q';

                //nxt place
                solve(board,row+1,n);

                //undo/ backtrack
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n){
        for(int i=0; i<row; i++){
            if(board[i][col]=='Q') return false;
        }

        //left diag
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        //right diag
        for(int i=row-1, j=col+1; i>=0&&j<=n-1; i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    private List<String> addBoardState (char[][] board){
        List<String> s = new ArrayList<>();
        for(char[] row: board){
            s.add(new String(row));
        }
        return s;
    }
}