class Solution {
//     public int longestPalindrome(String s) {
//         Map<Character, Integer>map = new HashMap<>();
//         for(int i=0; i<s.length(); i++){
//             if(!map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i), 1);
//             }else{
//                 map.put( s.charAt(i), map.get(s.charAt(i)) +1);
//             }
//         }
        
//         int longest = 0;
//         boolean odd =false;
//         for(Map.Entry<Character, Integer>mp: map.entrySet()){
//             if(mp.getValue() % 2==0){
//                 longest += mp.getValue();
//             }else{
//                 odd =true;
//                 longest+= mp.getValue()-1;
//             }
//         }
        
//         return odd == true ? longest + 1 : longest;
        
        
//     }
    
    
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}
}