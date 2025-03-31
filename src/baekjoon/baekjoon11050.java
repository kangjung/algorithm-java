package baekjoon;

import java.io.*;

//https://www.acmicpc.net/problem/11050
public class baekjoon11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		long result = 1;
		br.close();
		if (num2 == 0 || num1 == num2) {
			result = 1;
		} else {
			result = factorial(num1) / (factorial(num2) * factorial(num1 - num2));
		}
		System.out.println(result);
	}
	public static int factorial(int num) {
		int result = 1;
		for (int i = 2; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
