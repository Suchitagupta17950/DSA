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


//more cleaner version

class Solution {
    private void solve(int i,int j,int[][] grid,int n,boolean[][] vis,String path,List<String>ans,int[]di,int[]dj){
        if(i==n-1 && j==n-1){
            ans.add(path);
            return;
        }
        String dir="DLRU";
        vis[i][j]=true;
        for(int ind=0;ind<4;ind++){
            int nexti=i+di[ind];
            int nextj=j+dj[ind];

            if(nexti>=0 && nexti<n && nextj>=0 && nextj<n && grid[nexti][nextj]==1 && !vis[nexti][nextj]){
                
                solve(nexti,nextj,grid,n,vis,path+dir.charAt(ind),ans,di,dj);
               
            }
        }
         vis[i][j]=false;
       
    }
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n=grid.length;
        
      boolean[][] vis=new boolean[n][n];
      List<String>ans=new ArrayList<>();
      int[] di={+1,0,0,-1};
      int[] dj={0,-1,+1,0};
      if(n>0 && grid[0][0]==1){
        solve(0,0,grid,n,vis,"",ans,di,dj);
        
      }
      return ans;


    }
}