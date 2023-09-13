

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void helper(char[][] grid, int i, int j) {
        if(i<0 || j<0  || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j+1);
        helper(grid, i, j-1);
        return;

    }
}