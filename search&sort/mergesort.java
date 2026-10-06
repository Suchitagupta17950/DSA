class Solution {
    public void merge(int[] nums,int low,int mid,int high){
        int n=nums.length;
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int index=0;

        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                temp[index]=nums[left];
                left++;
            }else{
                temp[index]=nums[right];
                right++;
            }
            index++;
        }
        while(left<=mid){
            temp[index]=nums[left];
            left++;
            index++;
        }
        while(right<=high){
            temp[index]=nums[right];
            right++;
            index++;
        }

        for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
        }
    }
    public void ms(int[] nums, int low,int high){
        if(low==high)  return;
        int mid=low+(high-low)/2;
        ms(nums,low,mid);
        ms(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] mergeSort(int[] nums) {
        int n=nums.length;
        ms(nums,0,n-1);
        return nums;

    }
}
