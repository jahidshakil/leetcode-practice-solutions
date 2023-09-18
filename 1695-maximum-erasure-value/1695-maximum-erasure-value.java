class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int  left=0;
        int right =0;
        int mx = 0;
        int sum = 0;
        Map<Integer, Integer>map = new HashMap<>();
        
        while(right < nums.length){
            if(!map.containsKey(nums[right])){
                sum+=nums[right];
                map.put(nums[right], 1);
                right++;
                mx = Math.max(mx, sum);
            }else{
                sum-=nums[left];
                map.remove(nums[left]);
                left++;
            }
        }
        return mx;
            
    }
}