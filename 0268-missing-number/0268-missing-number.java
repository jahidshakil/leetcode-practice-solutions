class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1) ans = i+1;
            }
            
            return ans;
    }
}