class Solution {
    public boolean checkString(String s) {
        boolean seen_b = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                seen_b = true;
            }
            if(seen_b == true && s.charAt(i) == 'a') return false;
        }
        
        return true;
    }
}