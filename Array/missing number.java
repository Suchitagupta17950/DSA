class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long expectedSum=(long) n*(n+1)/2;
        
        long actualSum=0;
        for(int num:arr){
            actualSum+=num;
        }
        
        return (int)(expectedSum-actualSum);
    }
}
// Two approaches to find the missing number in an array of size n containing numbers from 1 to n+1. The first approach uses the sum formula, while the second approach uses XOR operation to find the missing number.
class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        int xor1=0;
        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        int xor2=0;
        for(int num:arr){
            xor2^=num;
        }
        return xor1^xor2;
    }
}
