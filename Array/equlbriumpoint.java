class equlbriumpoint {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalsum=0;
        int prefixsm=0;
        
        for(int i:arr) totalsum+=i;
        for(int i=0;i<arr.length;i++){
            int suffixsm=totalsum-prefixsm-arr[i];
            
            if(suffixsm==prefixsm) return i;
            
            prefixsm=prefixsm+arr[i];
        }
        
        return -1;
        
    }
}
