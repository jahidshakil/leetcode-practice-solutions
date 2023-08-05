class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[count] = nums[i];
                count++;
         }
        }
        
        
        return count;
    }
}


// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }
//         return j;
//     }
// }