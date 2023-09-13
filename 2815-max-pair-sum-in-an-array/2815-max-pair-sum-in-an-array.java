class Solution {
    public int maxSum(int[] nums) {
        int mx = -1;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if( helper(nums[i]) == helper(nums[j]) ){
                    mx =  Math.max(mx, nums[i] + nums[j]);
                }
            }
        }
        
        return mx;
    }
    
    
    public int helper(int b){
    
        int digitb=0;
     
        while(b>0){
            digitb = Math.max(b%10, digitb);
            b/=10;
        }
        
        return digitb;
    }
}

