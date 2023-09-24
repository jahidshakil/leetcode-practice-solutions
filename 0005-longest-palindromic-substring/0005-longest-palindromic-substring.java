class Solution {
    String longest = "";
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i+1);

        }
        
        return longest;
    }
    
    void checkPalindrome(String s , int left, int right ){
        while(left >=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            if(right- left + 1 > longest.length()){
                longest = s.substring(left, right+1);
            }
            left--;
            right++;
        }
    }
}