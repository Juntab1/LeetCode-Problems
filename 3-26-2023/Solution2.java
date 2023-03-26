// Challenging Medium level question. However, now I understand it and how to 
// use recursion in a time like this
// I need to research dfs more though.
class Solution2 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    numIslands += dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }

    private int dfs(char[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return 0;
        }
        // sinking of the island.
        grid[i][j] = '0';
        // recursion here so you don't have to write out the if statements each time
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        return 1;
    }
}