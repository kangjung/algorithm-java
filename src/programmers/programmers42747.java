package programmers;

import java.util.Arrays;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/42747
public class programmers42747 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers42747().solution(new int[] {3, 0, 6, 1, 5}));
	}
	

	public int solution(int[] citations) {
		Integer[]  arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		
		Arrays.sort(arr,Collections.reverseOrder());

		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] <= i) {
				return i;
			}
		}
		return citations.length;
	}
}