package baekjoon;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/2504
public class baekjoon2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> stack = new Stack<>();
		Stack<Integer> values = new Stack<>();

		int temp = 1;
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(') {
				stack.push(ch);
				values.push(temp);
				temp *= 2;
			} else if (ch == '[') {
				stack.push(ch);
				values.push(temp);
				temp *= 3;
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					System.out.println(0);
					return;
				}
				if (s.charAt(i - 1) == '(') sum += temp;
				stack.pop();
				temp = values.pop();
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					System.out.println(0);
					return;
				}
				if (s.charAt(i - 1) == '[') sum += temp;
				stack.pop();
				temp = values.pop();
			}
		}

		System.out.println(stack.isEmpty() ? sum : 0);
	}
}
