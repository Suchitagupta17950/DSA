class Solution {
    public String prefixToPostfix(String s) {
        // Your code goes here
        Stack<String> st=new Stack<>();
        
        int n=s.length();
        int i=n-1;

        while(i>=0){
            Character ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                st.push(String.valueOf(ch));
            }else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                String con= t1 + t2 + ch ;
                st.push(con);
            }
            i--;
        }
        return st.peek();


    }
}

