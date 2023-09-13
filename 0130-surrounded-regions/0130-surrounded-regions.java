class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0 ) return;
        if(board.length < 3 || board[0].length < 3) return;
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            if(board[i][0] == 'O') helper(board, i, 0);
            if(board[i][n-1] == 'O') helper(board, i, n-1);
        }
        
        for(int j=0; j<n; j++){
            if(board[0][j] == 'O') helper(board, 0, j);
            if(board[m-1][j] == 'O') helper(board, m-1, j);
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
    

    
    void helper(char board[][], int row, int col){
        if(row <0 || row> board.length-1 || col < 0 || col > board[0].length-1 || board[row][col] != 'O') return;
        
        board[row][col] = '*';
        helper(board, row+1, col);
        helper(board, row-1, col);
        helper(board, row, col+1);
        helper(board, row, col-1);

    }
}