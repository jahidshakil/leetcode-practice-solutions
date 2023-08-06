class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        int ans =0;
        for(Map.Entry<Integer,Integer>num : map.entrySet()){
            if(num.getValue() > n/2) ans= num.getKey();
        }
        
        return ans;
    }
}