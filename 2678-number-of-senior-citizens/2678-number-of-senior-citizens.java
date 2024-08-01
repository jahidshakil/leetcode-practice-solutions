class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String c:details){
            int i = Integer.parseInt(c.substring(11,13));
            if(i>60) ans++;
        }
        return ans;
    }
}