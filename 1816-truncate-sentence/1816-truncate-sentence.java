// class Solution {
//     public String truncateSentence(String s, int k) {
//         String arr[] = s.split(" ");
//         StringBuilder sb = new StringBuilder("");
        
//         int i=0;
//         while(i < k){
//             if(i==0){
//                 sb.append(arr[i]);
//                 i++;
//             }else{
//                 sb.append(" " + arr[i]);
//                 i++;
//             }
//         }
        
//         return sb.toString();
//     }
// }


class Solution{
    public String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;
        
        while(idx<s.length() && spaceCount<k){
            if(s.charAt(idx)==' ') spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string 
        return spaceCount==k?s.substring(0,idx-1):s;
    }
}