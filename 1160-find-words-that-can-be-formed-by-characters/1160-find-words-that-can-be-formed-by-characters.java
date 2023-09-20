class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[] = new int [26];
        for(int i=0; i<chars.length(); i++){
            freq[chars.charAt(i) - 'a']++;
        }
        int res = 0;
        for(int i=0; i<words.length; i++){
            if(helper(words[i], freq) == true){
                res+= words[i].length();
            }
        }
        return res;
    }
    
    
    boolean helper(String s, int freq[]){
        int newfreq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            newfreq[s.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(newfreq[i] > freq[i]) return false;
        }
        return true;
    }
}