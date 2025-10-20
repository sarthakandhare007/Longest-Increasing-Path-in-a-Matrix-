# Longest-Increasing-Path-in-a-Matrix-
🧩 Problem Statement:

Given an m x n integer matrix, return the length of the longest increasing path in the matrix.

From each cell, you can move in four directions — up, down, left, or right.
You may not move diagonally or move outside the boundary.


---

Example:

Input:
matrix = [
  [9, 9, 4],
  [6, 6, 8],
  [2, 1, 1]
]

Output: 4
Explanation: The longest increasing path is [1, 2, 6, 9].


---

💡 Approach:

We’ll use:

DFS (Depth First Search) for exploring paths.

Memoization (DP caching) to store results and avoid recomputation.


Each cell dp[i][j] stores the length of the longest increasing path starting from (i, j).

