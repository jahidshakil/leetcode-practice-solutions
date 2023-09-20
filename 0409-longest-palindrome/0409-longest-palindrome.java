class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer>map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put( s.charAt(i), map.get(s.charAt(i)) +1);
            }
        }
        
        int longest = 0;
        boolean odd =false;
        for(Map.Entry<Character, Integer>mp: map.entrySet()){
            if(mp.getValue() % 2==0){
                longest += mp.getValue();
            }else{
                odd =true;
                longest+= mp.getValue()-1;
            }
        }
        
        return odd == true ? longest + 1 : longest;
        
        
    }
}