class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l =0;
        int r= 0;
        while(l < nums.length && r<nums.length){
            if(nums[r] %2 ==0){
                swap(nums, l, r);
                l++;
            }
            r++;
        }
        return nums;
    }
    
    void swap(int nums[], int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    
}