class Solution {
    public int[][] generateMatrix(int n) {
     int res[][] = new int [n][n];
        int top =0;
        int bottom = n-1;
        int left =0;
        int right =n-1;
        
        int val =1;
        while(val<=n*n){
            for(int i=top; i<=right; i++){
                res[top][i] = val++;
            }
            top++;
            
            for(int i= top; i<=bottom; i++){
                res[i][right] = val++;
            }
            right--;
            
            for(int i=right; i>=left; i--){
                res[bottom][i] = val++;
            }
            bottom--;
            
            for(int i=bottom; i>=top; i--){
                res[i][left] = val++;
            }
            left++;   
        }
        
        return res;
    }
}