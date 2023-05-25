class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String p="";
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)!=' ')
         {
             p=p+s.charAt(i);
         }
         else
         {   
             if(!p.equals("")) 
             st.push(p);
             p="";
         }
     }      
        if(!p.equals(""))
            st.push(p);
        String ans ="";
        while(st.size()>1)
            ans=ans+ st.pop()+" ";
        ans=ans+st.pop();
        return ans;
    }
}