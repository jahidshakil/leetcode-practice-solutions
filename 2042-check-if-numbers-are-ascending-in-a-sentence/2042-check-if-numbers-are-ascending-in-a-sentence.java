// class Solution {
//     public boolean areNumbersAscending(String s) {
//         int prev = 0;        
//         for(int i=0; i<s.length(); i++){
//             if(Character.isDigit(s.charAt(i))){
//                 int num  = s.charAt(i) - '0';
                
//                 if(num <= prev){
//                     return false;
//                 }else{
//                     prev = num;
//                 }
//             }
//     }
        
//         return true; 
// }
    
// }

class Solution {
    public boolean areNumbersAscending(String s) 
    {
        int prev =0;
        String[] sent = s.split(" ");
        
        for(String i: sent)
        {
            if(Character.isDigit(i.charAt(0)) )
            {
                int num = Integer.parseInt(i);
                if(num <= prev)
                    return false;
                else
                    prev = num;
            }
        }
        return true;
    }
}