package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/118666
public class programmers118666 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers118666().solution(new String[] {"AN", "CF", "MJ", "RT", "NA"},new int[] {5, 3, 2, 7, 5}));
		//System.out.println(new programmers118666().solution(new String[] {"TR", "RT", "TR"},new int[] {7, 1, 3}));
		
	}

	public String solution(String[] survey, int[] choices) {
		String answer = "";
		String[] type = {"R","T","C","F","J","M","A","N"};
		int typeCnt[] = new int[8];
		
		int score = 0;
		int num = 0;
		
		for (int i = 0; i < survey.length; i++) {
			score = 4 - choices[i];
			if(score < 0) {
				num = Arrays.asList(type).indexOf(String.valueOf(survey[i].charAt(1)));
				typeCnt[num] += score * -1;
			} else if(score > 0) {
				num = Arrays.asList(type).indexOf(String.valueOf(survey[i].charAt(0)));
				typeCnt[num] += score;
			}
		}
		
		answer =  typeCnt[0] >=  typeCnt[1] ? "R" : "T";
		answer +=  typeCnt[2] >=  typeCnt[3] ? "C" : "F";
		answer +=  typeCnt[4] >=  typeCnt[5] ? "J" : "M";
		answer +=  typeCnt[6] >=  typeCnt[7] ? "A" : "N";
		
		return answer;
	}
}