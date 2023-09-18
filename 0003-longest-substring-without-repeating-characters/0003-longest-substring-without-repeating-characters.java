class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int l =0;
        int r = 0;
        int mx = 0;
        while(r<s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), 1);
                mx = Math.max(r-l+1, mx);
                r++;
            }else{
                map.remove(s.charAt(l));
                l++;
            }        
        }
        
        return mx;
    }
}

