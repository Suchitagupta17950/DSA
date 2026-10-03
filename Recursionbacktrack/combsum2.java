class Solution {
    private void FindComb2(int ind,int[] candidates,int target,List<List<Integer>>ans,List<Integer>ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if( i>ind && candidates[i]==candidates[i-1]) continue;
            if (candidates[i] > target) {
    break;
}
            ds.add(candidates[i]);
            FindComb2(i+1,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
            //FindComb2(i+1,candidates,target,ans,ds);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        FindComb2(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}