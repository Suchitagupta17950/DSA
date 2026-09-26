package search&sort;

public class firstandlstOcc {
    class Solution {
    public int firstOcc(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                res=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }
    public int lastOcc(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                res=mid;
                s=mid+1;

            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;

    }

    public int[] searchRange(int[] nums, int target) {
        int first=firstOcc(nums,target);
        int last=lastOcc(nums,target);

        
        
        return new int[]{first,last};
    }
}
}
