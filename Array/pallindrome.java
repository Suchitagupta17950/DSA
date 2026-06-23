class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
            int sum=0;
        
        while(n>0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        
        int rev = 0;
        n = sum;
        
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n /= 10;
        }
        
        return sum == rev;
    }
}