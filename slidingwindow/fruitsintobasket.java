package slidingwindow;

class Solution {
    public int totalFruits(int[] fruits) {
        //your code goes here
        int n=fruits.length;
        int l=0,maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                int fruit=fruits[l];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }

        
        return maxlen;
    }
}
