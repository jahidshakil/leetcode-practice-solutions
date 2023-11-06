class Solution {
    public int removeElement(int[] nums, int val) {
        int indx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[indx] = nums[i];
                indx++;
            }
        }
        
        return indx;
            
    }
}