class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            if(arr1[ (int)s.charAt(i)] != arr2[ (int)t.charAt(i) ]) return false;
            arr1[(int)s.charAt(i) ] =i+1 ;
            arr2[(int)t.charAt(i) ] = i+1;
        }
        
        return true;
        
    }
}