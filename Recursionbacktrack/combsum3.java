class Solution {
    private void solve(int value,int rem,int target,List<Integer>ds,List<List<Integer>>ans){
        if(rem==0){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(value>9 || target<0){
            return;
        }
        ds.add(value);
        solve(value+1,rem-1,target-value,ds,ans);
        ds.remove(ds.size()-1);
        solve(value+1,rem,target,ds,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
        List<List<Integer>>ans=new ArrayList<>();
        solve(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}