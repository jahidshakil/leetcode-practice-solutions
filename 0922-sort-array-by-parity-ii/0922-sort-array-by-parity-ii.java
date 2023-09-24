class Solution {
//     public int[] sortArrayByParityII(int[] nums) {
//         ArrayList<Integer>temp1 = new ArrayList<>();
//         ArrayList<Integer>temp2 = new ArrayList<>();
//         int ans[] = new int[nums.length];
//         for(int i=0; i<nums.length; i++){
//             if( nums[i] % 2== 0){
//                 temp1.add(nums[i]);
//             }else{
//                 temp2.add(nums[i]);
//             }
//         }
        
//         for(int i=0; i<nums.length; i++){
//             if(i %2 ==0){
//                 ans[i] = temp1.remove(0);
//             }else{
//                 ans[i] = temp2.remove(0);
//             }
//         }
        
//         return ans;
        
        
//     }
    
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        
        while(even < nums.length && odd < nums.length) {
            if(nums[even]%2 != 0) {
                swap(nums, even, odd);
                odd += 2;
            } else {
                even += 2;
            }
        }

        return nums;
    }
    
    
    public void swap(int[]nums, int l, int r  ){
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }
}

