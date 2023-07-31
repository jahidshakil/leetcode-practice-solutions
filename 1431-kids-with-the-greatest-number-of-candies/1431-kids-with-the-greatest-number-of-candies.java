class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // boolean []arr = new boolean [candies.length];
        ArrayList<Boolean>arr = new ArrayList<>();
        int mx= 0;
        
        for(int c:candies){
            mx=Math.max(c,mx);
        }
        
        
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= mx) arr.add(true);
                else arr.add(false);
        }
        
        
        return arr;
    }
}