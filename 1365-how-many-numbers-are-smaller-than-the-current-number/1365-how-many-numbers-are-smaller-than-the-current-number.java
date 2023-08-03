class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int temp =0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i])temp++;
            }
            arr[i] = temp;
        }
        
        return arr;
    }
}