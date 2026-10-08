class Solution {
    public String postToPre(String postfix) {
        // Your code goes here
        int i=0;
        int n=postfix.length();
        Stack<String> st =new Stack<>();

        while(i<n){
            Character ch=postfix.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a'&& ch<='z' || ch>='0' && ch<='9'){
                st.push(String.valueOf(ch));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String con= ch + t2 + t1;
                st.push(con);
            }
            i++;

        }
        return st.peek();
    }
}