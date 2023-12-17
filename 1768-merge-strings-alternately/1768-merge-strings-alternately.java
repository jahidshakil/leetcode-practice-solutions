// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int i=0;
//         int j=0;
//         StringBuilder sb = new StringBuilder();
//         while(i<word1.length() || j<word2.length()){
//             if(i<word1.length()){
//                 sb.append(word1.charAt(i++));
//             }
            
//             if(j<word2.length()){
//                 sb.append(word2.charAt(j++));
//             }
//         }
//         return sb.toString();
//     }
// }


class Solution {
        public String mergeAlternately(String w1, String w2) {
        int n = w1.length(), m = w2.length(), i = 0, j = 0;
        // StringBuilder res = new StringBuilder();
        String res ="";
        while (i < n && j < m) {
            res += w1.charAt(i++);
            res+=w2.charAt(j++);
        }
            if (i < w1.length()) res += w1.substring(i); 
            if (j < w2.length()) res+= w2.substring(j);
        return res;
    }
}