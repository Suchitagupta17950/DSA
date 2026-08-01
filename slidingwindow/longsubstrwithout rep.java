package slidingwindow;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0 ,r=0,l=0;
        int[]hash=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            char ch=s.charAt(r);
            if(hash[ch]!=-1 && hash[ch]>=l){
               l=hash[ch]+1;
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash[ch]=r;
            r++;



        }
        return maxlen;
       

       

        
    }
}