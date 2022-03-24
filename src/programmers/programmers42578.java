package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42578
public class programmers42578 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers42578().solution(new String[][] {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
		System.out.println(new programmers42578().solution(new String[][] {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
	}
	

	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(var i = 0 ; i < clothes.length ; i++){
			map.put(clothes[i][1], !map.containsKey(clothes[i][1]) ? 1 : map.get(clothes[i][1]) + 1);
		}
		
		Iterator<Integer> it = map.values().iterator();
		while(it.hasNext()) {
			answer *= it.next().intValue()+1;
		}
		
		return answer-1;
	}
}