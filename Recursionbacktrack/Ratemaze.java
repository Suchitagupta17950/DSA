class Solution {
    private void solve(int i,int j,int[][] grid,int n,boolean[][] vis,String path,List<String>ans){
        if(i==n-1 && j==n-1){
            ans.add(path);
            return;
        }
        vis[i][j]=true;
        if(i+1<n && grid[i+1][j]==1 && !vis[i+1][j]){
            solve(i+1,j,grid,n,vis,path+"D",ans);
        }
        if(j+1<n && grid[i][j+1]==1 && !vis[i][j+1]){
            solve(i,j+1,grid,n,vis,path+"R",ans);

        }
        if(j-1>=0 && grid[i][j-1]==1 &&!vis[i][j-1]){
            solve(i,j-1,grid,n,vis,path+"L",ans);
        }
        if(i-1>=0 && grid[i-1][j]==1 && !vis[i-1][j]){
            solve(i-1,j,grid,n,vis,path+"U",ans);
        }
        vis[i][j]=false;
    }
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n=grid.length;
        
      boolean[][] vis=new boolean[n][n];
      List<String>ans=new ArrayList<>();
      if(grid[0][0]==1){
        solve(0,0,grid,n,vis,"",ans);
        
      }
      return ans;


    }
}