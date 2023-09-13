// class Solution {
//     public int maxSum(int[] nums) {
//         int mx = -1;
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if( helper(nums[i]) == helper(nums[j]) ){
//                     mx =  Math.max(mx, nums[i] + nums[j]);
//                 }
//             }
//         }
        
//         return mx;
//     }
    
    
//     public int helper(int b){
    
//         int digitb=0;
     
//         while(b>0){
//             digitb = Math.max(b%10, digitb);
//             b/=10;
//         }
        
//         return digitb;
//     }
// }

class Solution {
    public int getMaxDigit(int num){
        int maxDigit = 0;
        while(num>0){
            int lastDigit = num % 10;
            num/=10;
            if(maxDigit<lastDigit){
                maxDigit = lastDigit;
            }
        }
        return maxDigit;
    }
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int currAns = getMaxDigit(nums[i]);
            if(map.containsKey(currAns)){
                if(nums[i] + map.get(currAns)>ans){
                    ans = nums[i] + map.get(currAns);
                }
                if(nums[i]>map.get(currAns)){
                    map.put(currAns,nums[i]);
                }
            }
            else{
                map.put(currAns,nums[i]);
            }
        }
        return ans;
    }
}