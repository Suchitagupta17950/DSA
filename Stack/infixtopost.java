class Solution {
    private int priority(char ch){
        if(ch=='^')  return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    public String infixToPostfix(String s) {
        // Your code goes here
        Stack<Character>st=new Stack<>();
        String ans="";
        int i=0;

        while(i<s.length()){
            Character ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ans=ans+ch;
            }else if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')' || ch=='}' || ch==']'){
                while(!st.isEmpty() && st.peek()!='(' && st.peek()!='{' && st.peek()!='['){
                    ans+=st.pop();
                }
                st.pop();
                
            }else{
                while(!st.isEmpty() && (priority(ch) < priority(st.peek()) ||
                (priority(ch) == priority(st.peek()) && ch!='^'))){
                    ans+=st.pop();
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}