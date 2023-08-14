class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int res[] = new int[k];
        res[0]=1;
        int count =0;
        int prefix = 0;
        
        for(int num : nums){
           prefix = ((prefix+num % k)+ k)%k;
            count += res[prefix]++;
        }
        
        return count;
        
    }
}
