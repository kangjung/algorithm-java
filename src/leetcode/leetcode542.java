package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/01-matrix
//542. 01 Matrix
public class leetcode542 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(new leetcode542().updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } })));
		System.out.println(Arrays.deepToString(new leetcode542().updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } })));
	}

	public int[][] updateMatrix(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 1) {
					mat[i][j] = Integer.MAX_VALUE;
					if (i - 1 >= 0 && mat[i - 1][j] != Integer.MAX_VALUE)
						mat[i][j] = Math.min(mat[i][j], 1 + mat[i - 1][j]);
					if (j - 1 >= 0 && mat[i][j - 1] != Integer.MAX_VALUE)
						mat[i][j] = Math.min(mat[i][j], 1 + mat[i][j - 1]);
				}
			}
		}
		for (int i = row - 1; i >= 0; i--) {
			for (int j = col - 1; j >= 0; j--) {
				if (i + 1 < row && mat[i + 1][j] != Integer.MAX_VALUE)
					mat[i][j] = Math.min(mat[i][j], 1 + mat[i + 1][j]);
				if (j + 1 < col && mat[i][j + 1] != Integer.MAX_VALUE)
					mat[i][j] = Math.min(mat[i][j], 1 + mat[i][j + 1]);
			}
		}
		return mat;
	}
}