package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/77484
public class programmers77484 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers77484().solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
		System.out.println(Arrays.toString(new programmers77484().solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
		System.out.println(Arrays.toString(new programmers77484().solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35})));
	}
	

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		int zeroCnt = 0;
		int chkNumCnt = 0;
		for(int i=0; i<lottos.length; i++){
			if(lottos[i] == 0) {
				zeroCnt++;
			} else {
				for(int j = 0; j < win_nums.length; j++) {
					if(win_nums[j]==lottos[i]) {
						chkNumCnt++;
					}
				}
			}
		}
		answer = new int[] {getRank(chkNumCnt+zeroCnt),getRank(chkNumCnt)};
		return answer;
	}
	
	private int getRank(int num) {
		switch (num) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}
}