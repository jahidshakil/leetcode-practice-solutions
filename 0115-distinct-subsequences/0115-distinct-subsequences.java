class Solution {
    public int numDistinct(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        
        int dp [][] = new int[t1+1][s1+1];
        
        for(int i=0; i<=s1; i++){
            dp[0][i] = 1;
        }
        
        for(int i=0; i<t1; i++){
            for(int j=0; j<s1; j++){
                if(t.charAt(i) == s.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + dp[i+1][j];
                } else{
                    dp[i+1][j+1] = dp[i+1][j];
                }
            }
        }
        
        return dp[t1][s1];
            
    }
}