class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String c:details){
            if(Integer.parseInt(c.substring(11,13))>60) ans++;
        }
        return ans;
    }
}