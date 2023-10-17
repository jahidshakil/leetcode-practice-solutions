class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
           for(int j=0; j<board[0].length; j++){
               if(board[i][j] == word.charAt(0) && helper(board, i, j, 0, word)) return true;
           } 
        }
        return false;
    }
    
    
    public boolean helper(char [][]b, int i, int j, int indx, String word){
        if(word.length() <= indx) return true;
        
        if(i <0 || j<0 || i>=b.length || j>= b[0].length || b[i][j] != word.charAt(indx) ||  b[i][j] =='0') return false;
        
        char tmp = b[i][j];
        b[i][j] = '0';
        
        if(helper(b, i+1, j , indx+1, word) ||
          helper(b, i-1, j , indx+1, word) || 
          helper(b, i, j+1 , indx+1, word) ||
          helper(b, i, j-1 , indx+1, word)
          ) return true;
        
        b[i][j] = tmp;
        return false;
        
    }
}