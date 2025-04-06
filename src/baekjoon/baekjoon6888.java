package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/6888
public class baekjoon6888 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());

		int cycle = lcm(4, lcm(2, lcm(3, 5)));

		for (int year = X; year <= Y; year += cycle) {
			System.out.println("All positions change in year " + year);
		}
	}
	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
