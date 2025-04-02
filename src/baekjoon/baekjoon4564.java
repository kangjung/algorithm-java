package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/4564
public class baekjoon4564 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = reader.readLine()) != null) {
			int i = Integer.parseInt(line);
			if (i == 0) break;

			System.out.print(i);
			while (i >= 10) {
				int product = 1;
				while (i > 0) {
					int num = i % 10;
					if (num != 0) {
						product *= num;
					} else {
						product = 0;
					}
					i /= 10;
				}
				i = product;
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}
}
