package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12939
public class programmers12939 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12939().solution("1 2 3 4"));
		System.out.println(new programmers12939().solution("-1 -2 -3 -4"));
		System.out.println(new programmers12939().solution("-1 -1"));
	}

	public String solution(String s) {
		int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];	
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return min + " " + max;
	}
}