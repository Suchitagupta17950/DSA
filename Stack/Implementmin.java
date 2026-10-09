import java.util.*;

class MinStack {
    Stack <Long> st;
    long mini;

    public MinStack() {
        st=new Stack<>();
        mini=Long.MAX_VALUE;
        
    }

    public void push(int val) {
        long x=val;
        if(st.isEmpty()){
            st.push(x);
            mini=x;

        }else{
            if(x>=mini) st.push(x);
            else{
                st.push(2*x-mini);
                mini=x;
            }
        }

   
    }

    public void pop() {
        if(st.isEmpty()){
            return ;
        }else{
        long  x=st.pop();
            if(x<mini){
                mini=2*mini-x;
            }
        }

    }

    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        long x=st.peek();
        if(x<mini){
            return (int)mini;
        }
        return (int)x;
    
    }

    public int getMin() {
        return (int) mini;
    }
}
