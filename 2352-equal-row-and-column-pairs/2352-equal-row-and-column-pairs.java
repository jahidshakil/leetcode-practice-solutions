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


// class Solution {
//     public int equalPairs(int[][] grid) {
//         HashMap<String, Integer> map = new HashMap<>();
//         int row = grid.length;
//         int col = grid.length;
//         for(int i = 0; i < row; i++){
//             String res = "";
//             for(int j = 0; j < col; j++){
//                 res += "-" + grid[i][j];
//             }
//             map.put(res, map.getOrDefault(res, 0) + 1);
//         }
//         int cnt = 0;
//         for(int j = 0; j < col; j++){
//             String res = "";
//             for(int i = 0; i < row; i++){
//                 res += "-" + grid[i][j];
//             }
//             cnt += map.getOrDefault(res, 0);
//         }
//         return cnt;
//     }
// }