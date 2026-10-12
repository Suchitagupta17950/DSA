class Solution {
    public int[] stockSpan(int[] arr, int n) {

        Stack<Integer>st=new Stack<>();
        int[] span=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
     
    }
}

