package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/5217
public class baekjoon5217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		for (int t = 0; t < testCases; t++) {
			int n = Integer.parseInt(br.readLine());

			StringBuilder sb = new StringBuilder();
			sb.append("Pairs for ").append(n).append(": ");

			boolean first = true;
			for (int i = 1; i < n / 2 + 1; i++) {
				int j = n - i;
				if (i < j) {
					if (!first) {
						sb.append(", ");
					}
					sb.append(i).append(" ").append(j);
					first = false;
				}
			}

			System.out.println(sb);
		}
	}
}
