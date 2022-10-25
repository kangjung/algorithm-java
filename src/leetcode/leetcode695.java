package leetcode;

//https://leetcode.com/problems/max-area-of-island
//695. Max Area of Island
public class leetcode695 {
	public static void main(String[] args) {
		System.out.println(new leetcode695().maxAreaOfIsland(
				new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
						{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
						{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } }));
		System.out.println(new leetcode695().maxAreaOfIsland(new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0 } }));

	}

	public int maxAreaOfIsland(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					result = Math.max(result, chack(grid, i, j));
				}
			}
		}
		return result;
	}

	public int chack(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
			return 0;
		}
		grid[i][j] = 0;
		return 1 + chack(grid, i - 1, j) + chack(grid, i + 1, j) + chack(grid, i, j - 1) + chack(grid, i, j + 1);
	}
}