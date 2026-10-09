class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int maxArea=0;

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int x = arr[st.peek()];
                st.pop();
                int nse=i;
                int pse=st.isEmpty() ? -1 : st.peek();
                maxArea=Math.max(maxArea,x*(nse-pse-1));
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int nse=n;
            int x=arr[st.peek()];
            st.pop();
            int pse= st.isEmpty() ? -1 : st.peek();
            maxArea=Math.max(maxArea,x*(nse-pse-1));
            
        
        }
        return maxArea;
       
    }
}
