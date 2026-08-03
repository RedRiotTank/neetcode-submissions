class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;

        for (int r = 0 ; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++){
                if (grid[r][c] == '1'){
                    counter++;

                    dfs(grid, r, c);
                }
            }
        }

        return counter;
    }

    void dfs(char[][] grid, int r, int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        
        if(grid[r][c] == '1'){
            grid[r][c] = '0';
        } else {
            return;
        }

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
