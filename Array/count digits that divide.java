// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            if(r!=0 && n%r==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}