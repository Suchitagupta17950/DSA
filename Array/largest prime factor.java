// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        
        int max=Integer.MIN_VALUE;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                max=Math.max(max,i);
                n=n/i;
            }
        }
        if (n>1){
            max=Math.max(max,n);
        }
        return max;
    }
}