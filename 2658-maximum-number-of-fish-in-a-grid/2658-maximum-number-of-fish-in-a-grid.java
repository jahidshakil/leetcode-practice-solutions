class Solution {
    public int findMaxFish(int[][] grid) {
        int mx = 0;
        int m= grid.length;
        int n = grid[0].length; 
        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] > 0){
                   mx= Math.max(mx, helper(grid, i, j));
                }
            }
        }
        
        return mx;
    }
    
    
    int helper(int[][]grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c >= grid[0].length || grid[r][c] == 0) return 0;
        int sum = grid[r][c];
        grid[r][c] = 0;
        sum += helper(grid, r+1, c) + helper(grid, r-1, c)+ helper(grid, r, c+1) + helper(grid, r, c-1);
        return sum;
    }
}