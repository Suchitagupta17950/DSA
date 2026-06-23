class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
        
        
        int i=0;
        int j=1;
        while(j<n){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
        
    
    }
}

