package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12936
public class programmers12936 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers12936().solution(3, 5)));
	}

	public int[] solution(int n, long k) {
		int[] answer = new int[n];
		
		ArrayList<Integer> nums = new ArrayList<>();
		long f = 1;
		int index = 0;
		
		for (int i = 1; i <= n; i++) {
			nums.add(i);
			f *= i;
		}
		
		k--;
		
		while (0 < n) {
			f /= n;
			answer[index++] = nums.get((int) (k / f));
			nums.remove((int) (k / f));
			k %= f;
			n--;
		}
		return answer;
	}
}