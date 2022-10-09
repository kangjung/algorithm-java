package programmers;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class programmers42842 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers42842().solution(10, 2)));
		System.out.println(Arrays.toString(new programmers42842().solution(8, 1)));
		System.out.println(Arrays.toString(new programmers42842().solution(24, 24)));
	}

	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;

		for (int i = 3; i < sum; i++) {
			int row = sum / i;
			if (row < 3) {
				continue;
			}
			if (row >= i) {
				if ((row - 2) * (i - 2) == yellow) {
					answer[0] = row;
					answer[1] = i;
					return answer;
				}
			}
		}
		return answer;
	}
}