package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class programmers150370 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers150370().solution("2022.05.19",new String[] {"A 6", "B 12", "C 3"},new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
		System.out.println(Arrays.toString(new programmers150370().solution("2020.01.01",new String[] {"Z 3", "D 5"},new String[] {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));
	}

	public int[] solution(String today, String[] terms, String[] privacies) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();

		int date = getDate(today);

		for (String s : terms) {
			String[] term = s.split(" ");
			map.put(term[0], Integer.parseInt(term[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");

			if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
				answer.add(i + 1);
			}
		}
		return answer.stream().mapToInt(integer -> integer).toArray();
	}

	private int getDate(String today) {
		String[] date = today.split("\\.");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		return (year * 12 * 28) + (month * 28) + day;
	}
}