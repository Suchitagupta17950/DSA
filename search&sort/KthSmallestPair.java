class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];

        while(low<high){
            int mid=low+(high-low)/2;

            int count=CountPairs(nums,mid);
            if(count>=k){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private int CountPairs(int[]nums,int distance){
        int count=0;
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            while(j<nums.length && nums[j]-nums[i]<=distance){
                j++;
            }
            count+=j-i-1;
        }
        return count;
    }
}