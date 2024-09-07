class Solution {
    public void dfs(int i,int j,char grid[][],boolean visited[][],int n,int m){
    
     if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' || visited[i][j]==true)
     return;
    visited[i][j]=true;
     int dr[]={0,1,0,-1};
     int dc[]={1,0,-1,0};
     for(int k=0;k<4;k++){
        dfs(i+dr[k],j+dc[k],grid,visited,n,m);
     }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    cnt++;
                    dfs(i,j,grid,visited,n,m);
                }
            }
        }
        return cnt;
    }
}