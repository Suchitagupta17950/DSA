public class sumOfSubarray {
    public int subarraySum(int[] arr) {
        // code here
        long sum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            sum+=(long) arr[i]*(i+1)*(n-i);
        }
        return (int)sum;
    }
}
