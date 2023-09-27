class Solution {
    public int tupleSameProduct(int[] nums) {
        
    HashMap<Integer,Integer>mp=new HashMap<>();
    int count=0;

    for(int i=0;i<nums.length-1;i++){

        for(int j=i+1;j<nums.length;j++){
        int tot=nums[i]*nums[j];
        if(mp.containsKey(tot)){
            count+=8*mp.get(tot);
            mp.put(tot,mp.get(tot)+1);
        }
        else{
            mp.put(tot,1);
        }
        }

    }

    return count;

    }
}