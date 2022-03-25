package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/92334
public class programmers92334 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers92334().solution(new String[] {"muzi", "frodo", "apeach", "neo"},new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2)));
		System.out.println(Arrays.toString(new programmers92334().solution(new String[] {"con", "ryan"},new String[] {"ryan con", "ryan con", "ryan con", "ryan con"},3)));
	}

	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		HashMap<String, HashSet<String>> map = new HashMap<>();
		HashMap<String, Integer> countMap = new HashMap<>();
		
		for (int i = 0; i < id_list.length; i++) {
			map.put(id_list[i], new HashSet<>());
			countMap.put(id_list[i], 0);
		}
		for (int i = 0; i < report.length; i++) {
			String[] ids = report[i].split("\\s");
			map.get(ids[1]).add(ids[0]);
		}
		for (String key : map.keySet()) {
			HashSet<String> set = map.get(key);
			if(set.size() >= k) {
				for (String setKey : set) {
					countMap.put(setKey, countMap.get(setKey)+1);
				}
			}
		}
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = countMap.get(id_list[i]);
		}
		
		return answer;
	}
}