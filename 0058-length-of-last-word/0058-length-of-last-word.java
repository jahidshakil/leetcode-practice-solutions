class Solution {
    public int lengthOfLastWord(String s) {
        int last =0;
        for(int i= s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' ') last++;
            else if(last > 0) return last;

        }
        return last;
    }
}