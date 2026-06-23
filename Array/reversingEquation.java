class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        String NewString="";
        Stack<String>st=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isDigit(ch)){
                NewString+=ch;
            }
            else{
                st.push(NewString);
                NewString="";
                NewString+=ch;
                st.push(NewString);
                NewString="";
            }
            
        }
        st.push(NewString);
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        
        return ans;
    }
}
