class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int calculatedArea= dfs(grid,r ,c );
                if (calculatedArea > maxArea) maxArea = calculatedArea;
            }
        }

        return maxArea;
    }

    int dfs(int[][] grid, int r, int c){
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return 0;

        int area = 0;

        if (grid[r][c] == 1) {
            area++;
            grid[r][c] = 0;
        } else {
            return 0;
        }

        area += dfs(grid, r + 1, c);
        area += dfs(grid, r - 1, c);
        area += dfs(grid, r, c + 1);
        area += dfs(grid, r, c - 1);

        return area;
    }
}
