package search&sort;
// 1st approach
class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid>0 && mid<nums.length-1){
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid-1]<nums[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            else if (mid==0){
                if((nums.length)==1){
                       return 0;
                       }
                if(nums[0]>nums[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if (mid==nums.length-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    return mid-1;
                }

            }

        }
        return -1;
    }
    
}

//2nd approach
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2])  return n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && 
            nums[mid]>nums[mid+1]){
                return  mid;
            }
            else if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else {
                high=mid;
            }
            


        }
        return -1;
    
    }
    
}

//3rd approach 
class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Going uphill → peak is on right
                low = mid + 1;
            } else {
                // Going downhill → peak is at mid or left
                high = mid;
            }
        }

        return low;
    }
}