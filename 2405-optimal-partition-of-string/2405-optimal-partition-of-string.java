class Solution {
    public int partitionString(String s) {
        int count =0;
        Map<Character,Boolean>mp = new HashMap<>();
        
        
        for(int i=0; i<s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                count++;
                mp.clear();
            }
            
            mp.put(s.charAt(i), true);
        }
        return count+1;
    }
}