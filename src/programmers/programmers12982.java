package programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
public class programmers12982 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12982().solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(new programmers12982().solution(new int[] {2,2,3,3}, 10));
	}
	

	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		
		Arrays.sort(d);
		
		for(int i = 0; i < d.length ; i++) {
			sum += d[i];
			if(sum <= budget)
				answer++;
			
		}
		return answer;
	}
}