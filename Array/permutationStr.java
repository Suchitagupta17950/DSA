public class permutationStr {
     public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int []s1Count=new int[26];
        int []windowCount=new int[26];

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
        }
        int windowSize=s1.length();
        for(int i=0;i<windowSize;i++){
            windowCount[s2.charAt(i)-'a']++;

        }
        if(matches(s1Count,windowCount)){
            return true;
        }
        for(int right=windowSize;right<s2.length();right++){
            windowCount[s2.charAt(right)-'a']++;

            int left=right-windowSize;
            windowCount[s2.charAt(left)-'a']--;

            if(matches(s1Count,windowCount)){
                return true;
            }
        }
        return false;
    }
    private boolean matches(int []a, int []b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
}
