package programmers;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class programmers42840 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers42840().solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(new programmers42840().solution(new int[] { 1, 3, 2, 4, 2 })));
	}

	public int[] solution(int[] answers) {
		ArrayList<Integer> arr = new ArrayList<>();
		int[] cnt = new int[3];
		int[] supoza1 = new int[] { 1, 2, 3, 4, 5 };
		int[] supoza2 = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] supoza3 = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == supoza1[i % supoza1.length]) {
				cnt[0]++;
			}
			if (answers[i] == supoza2[i % supoza2.length]) {
				cnt[1]++;
			}
			if (answers[i] == supoza3[i % supoza3.length]) {
				cnt[2]++;
			}
		}
		int max = (cnt[0] > cnt[1]) && (cnt[0] > cnt[2]) ? cnt[0] : (cnt[2] > cnt[1] ? cnt[2] : cnt[1]);
		for (int i = 0; i < cnt.length; i++) {
			if (max <= cnt[i]) {
				arr.add(i + 1);
			}
		}
		return arr.stream().mapToInt(i -> i).toArray();
	}
}