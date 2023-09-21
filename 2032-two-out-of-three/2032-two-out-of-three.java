// class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         Set<Integer>set = new HashSet<>();
//         Set<Integer>res = new HashSet<>();
//         for(int i=0; i<nums1.length; i++){
//             set.add(nums1[i]);
//         }
        
//         for(int i=0; i<nums2.length; i++){
//             if(set.contains(nums2[i])){
//                 res.add(nums2[i]);

//             }
//         }
        
//         for(int i=0; i<nums2.length; i++){
//                 set.add(nums2[i]);

//         }
        
//         for(int i=0; i<nums3.length; i++){
//             if(set.contains(nums3[i])){
//                 res.add(nums3[i]);

//             }
//         }
        
//         return new ArrayList(res);
        
        
//     }
// }

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        int count[][] = new int[3][101];
        for(int n : nums1)
            count[0][n] = 1;
        for(int n : nums2) 
            count[1][n] = 1;
        for(int n : nums3)
            count[2][n] = 1;
        
        for(int i=1; i<=100; i++) {
            if(count[0][i] + count[1][i] + count[2][i] > 1)
                list.add(i);
        }
        return list;
    }
}