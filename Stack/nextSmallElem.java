class Solution {
    public int[] nextSmallerElements(int[] arr) {
        // Your code goes here
        Stack<Integer> st =new Stack<>();
        int n=arr.length;
        int[] nse=new int[n];


        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nse;
    }
}