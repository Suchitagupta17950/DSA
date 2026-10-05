class Solution {
    public int mostFrequentElement(int[] nums) {
     HashMap<Integer,Integer>map=new HashMap<>();
     int max=0;
     int ans=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        

     }
     for(int num:nums){
        if(map.get(num)>max){
            max=map.get(num);
            ans=num;
        }
        else if (map.get(num) == max && num < ans) {
                ans = num;
            }
     }
     return ans;
    }
}


