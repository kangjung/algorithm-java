package programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42577
public class programmers42577 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers42577().solution(new String[] {"119", "97674223", "1195524421"}));
		System.out.println(new programmers42577().solution(new String[] {"123","456","789"}));
		System.out.println(new programmers42577().solution(new String[] {"12","123","1235","567","88"}));
	}
	

	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		
		for(int i=1; i<phone_book.length; i++){
			if(phone_book[i].startsWith(phone_book[i-1]))
				answer = false;
		}
		
		return answer;
	}
}