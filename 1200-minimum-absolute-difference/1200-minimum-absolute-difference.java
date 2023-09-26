class Solution{
public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            List<Integer>temp = new ArrayList<>();
            
            if (diff < min) {
                min = diff;
                res.clear();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                
                res.add(temp);
            } else if (diff == min) {
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                
                res.add(temp);
                // res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
                        
    
                        
}