class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        


        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';

            if(digit%2 !=0){
                String ans=s.substring(0,i+1);
                int j=0;
                while(j<ans.length() && ans.charAt(j)=='0'){
                    j++;
                }
                return ans.substring(j);

            }
        }
        return "";

    }
}
