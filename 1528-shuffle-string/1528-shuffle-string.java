class Solution {
    public String restoreString(String s, int[] indices) {
        char temp[] = new char[indices.length];
        // Arrays.sort(indices);
        
        for(int i=0; i<indices.length; i++){
            temp[indices[i]] = s.charAt(i);
        }
        
        
        StringBuilder sb = new StringBuilder("");
        
        for(char c:temp){
            sb.append(c);
        }
        
        return sb.toString();
    }
}