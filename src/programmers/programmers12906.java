package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class programmers12906 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers12906().solution(new int[]{1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(new programmers12906().solution(new int[]{4,4,4,3,3})));
	}

	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList();
		int num = -1;
		for (int i : arr) {
			if (num != i) {
				num = i;
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i < list.size(); i++){
			answer[i] = list.get(i);
		}
		return answer;
	}
}