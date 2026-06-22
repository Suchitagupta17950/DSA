// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int len=String.valueOf(n).length();
        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=(int)Math.pow(r,len);
            temp/=10;
            
        }
        if(sum==n){
            return true;
        }
        else return false;
    }
}