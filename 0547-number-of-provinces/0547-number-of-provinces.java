class Solution {
    public int findCircleNum(int[][] isConnected) {
        //explore neighbours adj matrix
        int n=isConnected.length, p=0;
        boolean[] vis = new boolean[n];

        for(int i=0; i<n; i++){
            if(!vis[i]){
                p++;
                dfs(isConnected,i,vis);
            }
        }
        return p;
    }
    void dfs(int[][] g, int node, boolean[] vis){
        vis[node]=true;
        for(int i=0; i<g.length; i++){
            if(g[node][i] == 1 && !vis[i]){
                //recurse to find connect
                dfs(g,i,vis);
            }
        }
    }
}