class Solution {
    public String postToInfix(String postExp) {
        // Your code goes here

        Stack<String>st=new Stack<>();
        int i=0;
        int n=postExp.length();

        while(i<n){
            Character ch = postExp.charAt(i);
            if(ch>='A' && ch<='Z'  ||  ch>='a' && ch<='z'  || ch>='0' && ch<='9'){
                st.push(String.valueOf(ch));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String con='(' + t2 + ch + t1 + ')' ;
                st.push(con);
            }
            
            i++;

        }
        return st.peek();
    }
}
