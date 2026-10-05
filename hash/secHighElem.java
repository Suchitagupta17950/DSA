class Solution {
    public int secondMostFrequentElement(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }
     int maxfreq=0;
     int secmaxfreq=0;
     

     for(int freq:map.values()){
        
        if(freq>maxfreq){
            secmaxfreq=maxfreq;
            maxfreq=freq;
        }
        else if(freq<maxfreq && freq>secmaxfreq){
            secmaxfreq=freq;
        }
       
     }
     if(secmaxfreq==0){
        return -1;
     }
     int ans=Integer.MAX_VALUE;
     for(int num:map.keySet()){
        if(secmaxfreq==map.get(num)){
            ans=Math.min(ans,num);
        }
     }
   


     
     return ans;
    }
}


