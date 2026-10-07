class Solution {
    private boolean isSafe(int node,int[][] edges, int n,int colortouse,int[] color){
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(u==node && color[v]==colortouse)  {
                return false;
            }
            if(v==node && color[u]==colortouse)  {
                return false;
        }
        }
        return true;

    }
    private boolean solve(int node,int n,int m,int[][] edges,int[] color){
        if(node==n) return true;
        for(int i=1;i<=m;i++){
            if(isSafe(node,edges,n,i,color)){
                color[node]=i;
                if(solve(node+1,n,m,edges,color)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    boolean graphColoring(int[][] edges, int m, int n) {
        //your code goes here
        int e=edges.length;
        int[] color=new int[n];
        //Arrays.fill(color,-1);
        
        return solve(0,n,m,edges,color);


        
    }
}