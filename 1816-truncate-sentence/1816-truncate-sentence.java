class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        
        int i=0;
        while(i < k){
            if(i==0){
                sb.append(arr[i]);
                i++;
            }else{
                sb.append(" " + arr[i]);
                i++;
            }
        }
        
        return sb.toString();
    }
}