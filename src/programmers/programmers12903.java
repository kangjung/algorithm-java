package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class programmers12903 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12903().solution("abcde"));
		System.out.println(new programmers12903().solution("qwer"));
	}

	public String solution(String s) {
		String answer = "";
		int n = s.length() / 2;
		if ((s.length() % 2) == 0) {
			answer = s.substring(n - 1, n + 1);
		} else {
			answer = s.substring(n, n + 1);
		}
		return answer;
	}
}