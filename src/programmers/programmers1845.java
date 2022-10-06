package programmers;

import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class programmers1845 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers1845().solution(new int[] { 3, 1, 2, 3 }));
		System.out.println(new programmers1845().solution(new int[] { 3, 3, 3, 2, 2, 4 }));
		System.out.println(new programmers1845().solution(new int[] { 3, 3, 3, 2, 2, 2 }));
	}

	public int solution(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if (!arr.contains(nums[i])) {
				arr.add(nums[i]);
			}
		}
		return (arr.size() >= nums.length / 2) ? nums.length / 2 : arr.size();
	}
}