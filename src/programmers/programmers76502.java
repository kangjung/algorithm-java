package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/76502
public class programmers76502 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers76502().solution("[](){}"));
		System.out.println(new programmers76502().solution("}]()[{"));
		System.out.println(new programmers76502().solution("[)(]"));
		System.out.println(new programmers76502().solution("}}}"));
	}
	
	public int solution(String s) {
		int answer = 0;
		boolean check = true;
		for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<>();
			check = true;
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
					stack.push(s.charAt(j));
				} else {
					if (!stack.isEmpty()) {
						char c = stack.pop();
						char str = s.charAt(j);
						if(c == '(' && str == ')') {
							continue;
						} else if(c == '{' && str == '}') {
							continue;
						} else if(c == '[' && str == ']') {
							continue;
						} else {
							check = false;
						}
					} else {
						check = false;
					}
				}
			}
			if(stack.isEmpty() && check) {
				answer++;
			}
			s = s.substring(1, s.length()) + s.substring(0,1);
		}
        return answer;
    }
}