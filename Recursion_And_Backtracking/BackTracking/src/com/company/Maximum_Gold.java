package com.company;

// Maximum Gold:- https://leetcode.com/problems/path-with-maximum-gold/

public class Maximum_Gold {
    public static void main(String[] args) {
        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        System.out.println(getMaximumGold(grid));
    }
    //----------------------------------------------------------------------------

    public static int getMaximumGold(int[][] grid) {
        int[][] a = new int[grid.length][grid[0].length];
        int p = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                p = Math.max(p, path(grid, a, i, j, 0));
            }
        }
        return p;
    }

    public static int path(int[][] g, int[][] v, int r, int c, int p) {
        if (r == g.length && c == g[0].length)
            return p;

        if (v[r][c] == 1 || g[r][c] == 0)
            return p;
        v[r][c] = 1;
        int k = 0;
        if (c < g[0].length - 1)
            k = Math.max(k, path(g, v, r, c + 1, p + g[r][c]));
        if (r < g.length - 1)
            k = Math.max(k, path(g, v, r + 1, c, p + g[r][c]));
        if (r > 0)
            k = Math.max(k, path(g, v, r - 1, c, p + g[r][c]));
        if (c > 0)
            k = Math.max(k, path(g, v, r, c - 1, p + g[r][c]));
        v[r][c] = 0;
        return k;
    }
}
