class Solution {
    public int dominantIndex(int[] nums) {
        int largestNum = 0;
        int largestIndex = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] > largestNum){
                largestNum = nums[i];
                largestIndex = i;
            }
        }
        
        for(int i =0; i<nums.length; i++){
            if( i != largestIndex && largestNum < 2*nums[i]){
                return -1;
            }
        }
        
        return largestIndex;
    }
}