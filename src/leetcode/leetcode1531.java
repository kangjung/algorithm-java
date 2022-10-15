package leetcode;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/string-compression-ii/
//1531. String Compression II
public class leetcode1531 {
	public static void main(String[] args) {
		System.out.println(new leetcode1531().getLengthOfOptimalCompression("aaabcccd", 2));
		System.out.println(new leetcode1531().getLengthOfOptimalCompression("aabbaa", 2));
		System.out.println(new leetcode1531().getLengthOfOptimalCompression("aaaaaaaaaaa", 0));
	}

	public int getLengthOfOptimalCompression(String s, int k) {
		int result = 0, cnt = 0, diffCnt = 0;
		int length = s.length();
		int[][] arr = new int[length + 1][k + 1];
		for (int i = 0; i <= length; i++) {
			Arrays.fill(arr[i], Integer.MAX_VALUE >> 1);
		}
		arr[0][0] = 0;
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j <= k ; j++) {
				if (j > 0) {
					arr[i][j] = arr[i - 1][j - 1];
				}
				cnt = 0;
				diffCnt = 0;
				for (int m = i; m >= 1 && diffCnt <= j; m--) {
					if (s.charAt(m - 1) == s.charAt(i - 1)) {
						cnt++;
						arr[i][j] = Math.min(arr[i][j], arr[m - 1][j - diffCnt] + ((cnt == 1) ? 1 : (cnt < 10) ? 2 : (cnt < 100) ? 3 : 4));
					} else
						diffCnt++;
				}
			}
		}
		result = arr[length][k];
		return result;
	}
}