class Solution {
    public int mostWordsFound(String[] sentences) {
        int mx = 0;
        for(String str : sentences){
            int c = 0;
            for(int j=0; j<str.length()-1; j++){
                if(str.charAt(j)==' ') c++;
            }
            
            mx = Math.max(mx, c+1 );
                
        }
        
        return mx;
    }
}