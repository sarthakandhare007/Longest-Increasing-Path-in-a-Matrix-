public class LongestIncreasingPath {
    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        m = matrix.length;
        n = matrix[0].length;

        int[][] dp = new int[m][n];
        int maxPath = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPath = Math.max(maxPath, dfs(matrix, dp, i, j));
            }
        }
        return maxPath;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] != 0) return dp[i][j]; // already computed

        int max = 1; // at least itself
        for (int[] dir : directions) {
            int x = i + dir[0], y = j + dir[1];
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, dp, x, y));
            }
        }
        dp[i][j] = max;
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {9,9,4},
            {6,6,8},
            {2,1,1}
        };
        LongestIncreasingPath solver = new LongestIncreasingPath();
        System.out.println("Longest Increasing Path Length: " + solver.longestIncreasingPath(matrix));
    }
}
