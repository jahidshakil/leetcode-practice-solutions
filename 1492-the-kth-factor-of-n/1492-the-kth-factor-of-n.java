// class Solution {
//     public int kthFactor(int n, int k) {
//         ArrayList<Integer>arr = new ArrayList<>();
//         for(int i=1; i<=n; i++){
//             if(n%i ==0) arr.add(i);
//         }
        
//        if(arr.size() <k) return -1;
//         else return arr.get(k-1);
//     }
// }




class Solution {
    public int kthFactor(int n, int k) {
        
        for(int i=1; i<Math.sqrt(n); ++i){
            if(n%i ==0 && --k==0) return i;
        }
        
        for(int i= (int)Math.sqrt(n); i>=1; --i){
            if(n%(n/i) ==0 && --k==0) return n/i;
        }
        return -1;
        
    }
}