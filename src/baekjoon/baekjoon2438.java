package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2438
public class baekjoon2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reder.readLine());
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= num; i++) {
			str.append("*".repeat(i)).append("\n");
		}
		System.out.print(str);
	}
}
