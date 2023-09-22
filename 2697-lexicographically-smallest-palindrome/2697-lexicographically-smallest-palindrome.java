class Solution {
    public String makeSmallestPalindrome(String s) {
        int r =s.length()-1;
        int l = 0;
        char arr []  = s.toCharArray();
        
        while( l< r){
            if( arr[l]  > arr[r] ){
                arr[l] = s.charAt(r);
                r--;
                l++;
            }else{
                arr[r] = arr[l];
                r--;
                l++;
            }
        }
        
        
        return new String(arr);
    }
}