package programmers;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12921
public class programmers12921 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12921().solution(10));
		System.out.println(new programmers12921().solution(5));
	}

	public int solution(int n) {
		int answer = 0;
		ArrayList<Boolean> check = new ArrayList<Boolean>();
		check.add(false);
		check.add(false);
		for (int i = 2; i <= n; i++) {
			check.add(i, true);
		}
		for (int i = 2; (i * i) <= n; i++) {
			if (check.get(i)) {
				for (int j = i * i; j <= n; j += i)
					check.set(j, false);
			}
		}
		for (int i = 0; i <= n; i++) {
			if (check.get(i) == true) {
				answer++;
			}
		}
		return answer;
	}
}