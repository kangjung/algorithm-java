package leetcode;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/flood-fill
//733. Flood Fill
public class leetcode733 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(new leetcode733().floodFill(new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }, 1, 1, 2)));
		System.out.println(Arrays.deepToString(new leetcode733().floodFill(new int[][] { { 0, 0, 0 }, { 0, 0, 0 } }, 0, 0, 0)));
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if (image[sr][sc] == color) {
			return image;
		}
		fill(image, sr, sc, color, image[sr][sc]);
		return image;
	}

	public void fill(int[][] image, int sr, int sc, int color, int c) {
		if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
			return;
		}
		if (image[sr][sc] != c) {
			return;
		}
		image[sr][sc] = color;
		fill(image, sr - 1, sc, color, c);
		fill(image, sr + 1, sc, color, c);
		fill(image, sr, sc - 1, color, c);
		fill(image, sr, sc + 1, color, c);
	}
}