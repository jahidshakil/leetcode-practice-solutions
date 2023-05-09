class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int m = matrix.length;
     int n = matrix[0].length;

     int startrow = 0;
     int startcol= 0;
     int endrow = m-1;;
     int endcol = n-1;

     ArrayList<Integer> res = new ArrayList<>();


     while(startrow<= endrow && startcol <= endcol){
         for(int i= startcol; i<=endcol; i++){
             res.add(matrix[startrow][i]);
         }
         startrow++;


         for(int i= startrow; i<=endrow; i++){
             res.add(matrix[i][endcol]);
         }
         endcol--;


         if(startrow<=endrow){
             for(int i= endcol; i>=startcol; i--){
             res.add(matrix[endrow][i]);
         }
         }
         endrow--;


         if(startcol <= endcol){
             for(int i= endrow; i>=startrow; i--){
             res.add(matrix[i][startcol]);
         }
         }
         startcol++;


     }


     return res;   
    }
}