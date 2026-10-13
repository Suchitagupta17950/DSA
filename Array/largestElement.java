class Solution {
    public int largestElement(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }

        }
        return maxi;
    
    }
}