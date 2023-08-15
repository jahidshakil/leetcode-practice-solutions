class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        
        int freq[] = new int[n+1];
        
        for(int i : citations){
            if(i > n){
                freq[n]++;
            }else{
                freq[i]++;
            }
        }
        
        int total = 0;
        for(int i= n; i>0; i--){
            total+=freq[i];
            if(total>=i){
                return i;
            }
        }
        
        return 0;
    }
}