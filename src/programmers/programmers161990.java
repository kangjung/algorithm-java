package programmers;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class programmers161990 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers161990().solution(new String[] {".#...", "..#..", "...#."})));
		System.out.println(Arrays.toString(new programmers161990().solution(new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."})));
		System.out.println(Arrays.toString(new programmers161990().solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
		System.out.println(Arrays.toString(new programmers161990().solution(new String[] {"..", "#."})));
	}

	public int[] solution(String[] wallpaper) {
		int row = wallpaper.length;
		int col = wallpaper[0].length();
		int minCol = Integer.MAX_VALUE;
		int minRow = Integer.MAX_VALUE;
		int maxCol = Integer.MIN_VALUE;
		int maxRow = Integer.MIN_VALUE;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				if ('#' == wallpaper[i].charAt(j)) {
					minRow = Math.min(minRow, i);
					minCol = Math.min(minCol, j);
					maxRow = Math.max(maxRow, i);
					maxCol = Math.max(maxCol, j);
				}
		}
		return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
	}
}