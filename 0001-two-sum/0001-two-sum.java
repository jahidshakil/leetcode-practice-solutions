class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                result[1] = i;
                result[0] = map.get(rem);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}



