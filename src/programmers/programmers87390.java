package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/87390
public class programmers87390 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers87390().solution(3, 2, 5)));
		System.out.println(Arrays.toString(new programmers87390().solution(4, 7, 14)));

	}

	public int[] solution(int n, long left, long right) {
		List<Integer> list = new ArrayList<>();

		for (long i = left; i < right + 1; i++) {
			list.add((int) (Math.max(i / n, i % n) + 1));
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}