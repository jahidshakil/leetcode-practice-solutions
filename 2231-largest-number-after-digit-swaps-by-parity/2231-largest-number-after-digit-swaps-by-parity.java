class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i] && (arr[j] - arr[i]) %2 == 0){
                    swap(i, j , arr);
                }
            }
        }  
        return   Integer.parseInt(new String(arr));

        }
    
    void swap( int l, int r, char arr[]){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r]  = temp;
    }
}


