class Solution {
    public void reverseString(List<Character> s) {
        //your code goes here

        int start=0;
        int end=s.size()-1;

        while(start<=end){
            Character temp=s.get(start);
            s.set(start,s.get(end));
            s.set(end,temp);

            start++;
            end--;
        }
    }
}
