class Solution {
    public int equalPairs(int[][] grid) {
        int count =0;
        int n = grid.length;
        int [][]trans =  new int[n][n];
        transpose(grid, trans);
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(Arrays.equals(grid[i], trans[j])) count++;
            }
        }
        return count;
    }
    
    
    
   public static void transpose(int[][]A, int[][]B){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                B[j][i] = A[i][j];
            }
        }
    }
    
}