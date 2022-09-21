package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42888
public class programmers42888 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers42888().solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})));
	}
	
	public String[] solution(String[] record) {
		Map<String, String> user = new HashMap<>();
		ArrayList<String> move = new ArrayList<>();
		for(int i=0; i<record.length ;i++) {
			String[] arr = record[i].split(" ");
			if("Enter".equals(arr[0])) {
				user.put(arr[1], arr[2]);
			} else if("Leave".equals(arr[0])) {
				continue;
			} else if("Change".equals(arr[0])) {
				user.put(arr[1], arr[2]);
			}
		}
		for(int i=0; i<record.length ;i++) {
			String[] arr = record[i].split(" ");
			if("Enter".equals(arr[0])) {
				move.add(user.get(arr[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
			} else if("Leave".equals(arr[0])) {
				move.add(user.get(arr[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.");
			}
		}
		String[] answer = new String[move.size()];
		move.toArray(answer);
		return answer;
	}
}