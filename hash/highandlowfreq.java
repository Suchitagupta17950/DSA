class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      int maxfreq=Integer.MIN_VALUE;
      int minfreq=Integer.MAX_VALUE;

      for(int freq:map.values()){
        maxfreq=Math.max(maxfreq,freq);
        minfreq=Math.min(minfreq,freq);
        
        
        }

        return maxfreq+minfreq;
        
    
    

    }
}

