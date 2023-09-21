class Solution {
    public int nthUglyNumber(int n) {
        int dp[] = new  int[n];
        dp[0] = 1;
        
        int factor2 = 2, indx2=0;
        int factor3 = 3, indx3 = 0;
        int factor5 = 5, indx5 = 0;
        
        for(int i= 1; i<n; i++){
            int min = Math.min( factor2, Math.min( factor3, factor5) );
            
            dp[i] = min;
            
           
            if(min == factor2){
               factor2 = 2 * dp[++indx2];
           } 
            
            if(min == factor3){
               factor3 = 3 * dp[++indx3];
           } 
            
            if(min == factor5){
               factor5 = 5 * dp[++indx5];
           } 
            
        }
        
        return dp[n-1];
            
        }
}