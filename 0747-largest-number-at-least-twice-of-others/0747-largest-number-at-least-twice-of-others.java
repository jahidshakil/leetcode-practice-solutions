// class Solution {
//     public int dominantIndex(int[] nums) {
//         int largestNum = 0;
//         int largestIndex = 0;
//         for(int i =0; i<nums.length; i++){
//             if(nums[i] > largestNum){
//                 largestNum = nums[i];
//                 largestIndex = i;
//             }
//         }
        
//         for(int i =0; i<nums.length; i++){
//             if( i != largestIndex && largestNum < 2*nums[i]){
//                 return -1;
//             }
//         }
        
//         return largestIndex;
//     }
// }

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, index = -1, second = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second)
                second = nums[i];
        }
        return second * 2 <= max ? index : -1;
    }
}