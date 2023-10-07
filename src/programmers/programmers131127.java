package programmers;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class programmers131127 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers131127().solution(new String[] {"banana", "apple", "rice", "pork", "pot"},new int[] {3, 2, 2, 2, 1},new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"} ));
		System.out.println(new programmers131127().solution(new String[] {"apple"},new int[] {10},new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"} ));

	}

	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		int day = 10;
		List<String> wantList = new ArrayList<>();
		for (int i = 0; i < want.length; i++) {
			while (number[i]-- > 0) {
				wantList.add(want[i]);
			}
		}
		for (int i = 0; i < discount.length - day + 1; i++) {
			List<String> buyList = new ArrayList<>(wantList);
			for (int j = i; j < day + i; j++) {
				buyList.remove(discount[j]);
			}
			answer += buyList.size() == 0 ? 1 : 0;
		}
		return answer;
	}
}