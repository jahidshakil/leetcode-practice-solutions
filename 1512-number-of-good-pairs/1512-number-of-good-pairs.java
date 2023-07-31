// 54


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer>hp = new HashMap<>();
        for(int num : nums){
            hp.put(num, hp.getOrDefault(num,0)+1);
            
            res+=hp.get(num)-1;
        }
        return res;
    }
}

