package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42885
public class programmers42885 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers42885().solution(new int[] {70, 50, 80, 50},100 ));
		System.out.println(new programmers42885().solution(new int[] {70, 80, 50},100 ));
	}
	
	public int solution(int[] people, int limit) {
		int answer = 0;
		Integer[] arr = Arrays.stream(people).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());
		
		int last = arr.length-1;
		int index = 0;
		
		while (index <= last) {
			if(arr[last] + arr[index] <= limit) {
				answer++;
				last--;
			} else {
				answer++;
			}	
			index++;
		}	
		return answer;
	}
}