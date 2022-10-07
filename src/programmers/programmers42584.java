package programmers;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42584
public class programmers42584 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers42584().solution(new int[] { 1, 2, 3, 2, 3 })));
	}

	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				int idx = stack.pop();
				answer[idx] = i - idx;
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int idx = stack.pop();
			answer[idx] = prices.length - idx - 1;
		}
		return answer;
	}
}