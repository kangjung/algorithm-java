package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class programmers12951 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12951().solution("3people unFollowed me"));
		System.out.println(new programmers12951().solution("for the last week"));
	}

	public String solution(String s) {
		String answer = "";
		String[] arr = s.toLowerCase().split("");
		String last = " ";
		for (String i : arr) {
			answer += (" ".equals(last)) ? i.toUpperCase() : i;
			last = i;
		}
		return answer;
	}
}