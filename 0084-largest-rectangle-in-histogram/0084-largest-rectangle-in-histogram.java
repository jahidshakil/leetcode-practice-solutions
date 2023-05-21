// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int mx =-1;
//         for(int i=1; i<heights.length-1; i++){
//             int l=i-1;
//             int r = i+1;
            
//             while(l>=0){
//                 if(heights[l] < heights[i]){
//                     break;
//                 }
//                 l--;
//             }
            
//             while(r<heights.length){
//                 if(heights[r] < heights[i]){
//                     break;
//                 }
//                 r++;
//             }
//             mx=Math.max(mx, (r-l-1)*heights[i]);
            
//         }
        
//         return mx;
//     }
// }

class Solution{
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if (s.isEmpty() || h >= heights[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
    
}