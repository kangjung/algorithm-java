package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/68644
public class programmers68644 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers68644().solution(new int[] {2,1,3,4,1})));
		System.out.println(Arrays.toString(new programmers68644().solution(new int[] {5,0,2,7})));
	}
	
	public int[] solution(int[] numbers) {
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(!sum.contains(numbers[i]+numbers[j])) {
					sum.add(numbers[i]+numbers[j]);
				}
			}
		}
		int[] answer = sum.stream().mapToInt(i -> i).toArray();
		Arrays.sort(answer);
		return answer;
	}
}