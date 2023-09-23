class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        String arr[] = s.split(" ");
        
        for(String str : arr){
            if(Character.isDigit(str.charAt(0))){
                int num  = Integer.parseInt(str);
                
                if(num <= prev){
                    return false;
                }else{
                    prev = num;
                }
            }
    }
        
        return true; 
}
    
}
