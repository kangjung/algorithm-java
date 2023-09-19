package programmers;

import java.util.Arrays;
import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class programmers154539 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers154539().solution(new int[] {2, 3, 3, 5})));
		System.out.println(Arrays.toString(new programmers154539().solution(new int[] {9, 1, 5, 3, 6, 2})));
	}

	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> Stack = new Stack<>();
		for (int i = numbers.length - 1; i >= 0; i--) {
			int num = numbers[i];
			answer[i] = -1;
			while (!Stack.empty()) {
				int big = Stack.peek();
				if (big > num) {
					answer[i] = big;
					break;
				}
				Stack.pop();
			}
			Stack.add(num);
		}
		return answer;
	}
}