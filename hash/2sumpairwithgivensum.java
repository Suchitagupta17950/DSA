package hash;

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
       HashSet<Integer>map=new HashSet<>();
       for(int num:arr){
           int comple=target-num;
           if(map.contains(comple)){
               return true;
           }
           map.add(num);
       }
       return false;
        
    }
}