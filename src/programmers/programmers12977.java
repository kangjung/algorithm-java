package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12977
public class programmers12977 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12977().solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(new programmers12977().solution(new int[] { 1, 2, 7, 6, 4 }));
	}

	public int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					list.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int cnt = 0;
			int num = list.get(i);
			for (int j = 1; j <= num; j++) {
				if ((num % j) == 0) {
					cnt++;
				}
				if (cnt >= 3) {
					break;
				}
			}
			if (cnt == 2) {
				answer++;
			}
		}
		return answer;
	}
}