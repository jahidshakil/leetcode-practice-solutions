class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer>temp1 = new ArrayList<>();
        ArrayList<Integer>temp2 = new ArrayList<>();
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if( nums[i] % 2== 0){
                temp1.add(nums[i]);
            }else{
                temp2.add(nums[i]);
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i %2 ==0){
                ans[i] = temp1.remove(0);
            }else{
                ans[i] = temp2.remove(0);
            }
        }
        
        return ans;
        
        
    }
}