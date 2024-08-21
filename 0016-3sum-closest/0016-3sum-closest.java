class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        int closeDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j= i+1; j<nums.length-1; j++ ){
                for(int k= j+1; k<nums.length; k++){
                    int curSum = nums[i] + nums[j] + nums[k];
                    int curDiff = Math.abs(curSum - target);
                    
                    if(curDiff<closeDiff){
                        closeDiff = curDiff;
                        closestSum = curSum;
                    }
                }
            }
        }
        return closestSum;
    }
}