package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class programmers42862 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers42862().solution(5,new int[] {2, 4},new int[] {1, 3, 5} ));
		System.out.println(new programmers42862().solution(5,new int[] {2, 4},new int[] {3} ));
		System.out.println(new programmers42862().solution(3,new int[] {3},new int[] {1} ));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(reserve[j] == lost[i] && reserve[j] > 0) {
					reserve[j] = -1;
					lost[i] = -1;
					answer++;
					break;
				}
			}
		}
		for(int i = 0; i < lost.length; i++) {
			if(lost[i] > 0) {
				for(int j = 0; j < reserve.length; j++) {
					if((reserve[j] == (lost[i]-1) || reserve[j] == (lost[i]+1))  && reserve[j] > 0) {
						reserve[j] = -1;
						answer++;
						break;
					}
				}
			}
		}
		
		return answer;
	}
}