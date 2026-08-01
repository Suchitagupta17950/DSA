package hash;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer>map=new HashMap<>();

       int left=0;
       int maxLen=0;
       for(int r=0;r<s.length();r++){
        char ch=s.charAt(r);
         if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
        
       }
        map.put(ch,r);
         maxLen = Math.max(maxLen, r - left + 1);
       }
       return maxLen;


       

        
    }
}