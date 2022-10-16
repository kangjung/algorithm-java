package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
//1335. Minimum Difficulty of a Job Schedule
public class leetcode1335 {
	public static void main(String[] args) {
		System.out.println(new leetcode1335().minDifficulty(new int[] { 6, 5, 4, 3, 2, 1 }, 2));
		System.out.println(new leetcode1335().minDifficulty(new int[] { 9, 9, 9 }, 4));
		System.out.println(new leetcode1335().minDifficulty(new int[] { 1, 1, 1 }, 3));
	}

	public int minDifficulty(int[] jobDifficulty, int d) {
		int result = 0;
		int length = jobDifficulty.length;
		if (length < d) {
			return -1;
		}
		int[][] arr = new int[d + 1][length + 1];
		for (int i = 0; i <= d; i++) {
			Arrays.fill(arr[i], Integer.MAX_VALUE);
		}
		arr[0][0] = 0;
		for (int i = 1; i <= d; i++) {
			for (int j = i; j <= length; j++) {
				int max = jobDifficulty[j - 1];
				for (int k = j; k >= i; k--) {
					max = Math.max(max, jobDifficulty[k - 1]);
					if (arr[i - 1][k - 1] != Integer.MAX_VALUE) {
						arr[i][j] = Math.min(arr[i][j], arr[i - 1][k - 1] + max);
					}
				}
			}
		}
		result = arr[d][length];
		return result;
	}
}