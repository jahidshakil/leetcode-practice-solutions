// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int temp = 0;
        
//         for(int i=0; i<jewels.length(); i++){
//             for(int j=0; j<stones.length(); j++){
//                 if(jewels.charAt(i) == stones.charAt(j)){
//                     temp++;
//                 }
//             }
//         }
//         return temp;
//     }
// }


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int temp = 0;
        
        Set st= new HashSet();
        for(char c : jewels.toCharArray()){
            st.add(c);
        }
        
        for(char c : stones.toCharArray()){
            if(st.contains(c))temp++;
        }
        
        return temp;
    }
}