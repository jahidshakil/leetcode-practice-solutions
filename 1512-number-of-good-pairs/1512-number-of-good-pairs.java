// 54


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int arr [] = new int[101];
        for(int n:nums){
            res+=arr[n]++;
        }
        return res;
    }
}

