package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12909
public class programmers12909 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12909().solution("()()"));
		System.out.println(new programmers12909().solution("(())()"));
		System.out.println(new programmers12909().solution(")()("));
		System.out.println(new programmers12909().solution("(()("));
	}

	boolean solution(String s) {
		if (s.charAt(0) == ')')
			return false;
		boolean answer = true;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push(s.charAt(i));
			else if (!stack.isEmpty() && s.charAt(i) == ')')
				stack.pop();
			else
				return false;
		}
		if (!stack.isEmpty()) {
			answer = false;
		}
		return answer;
	}
}