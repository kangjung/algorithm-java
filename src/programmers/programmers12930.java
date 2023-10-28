package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class programmers12930 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12930().solution("try hello world"));
	}

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] arr = s.split("");
		int idx = 0;
		for (String value : arr) {
			if (" ".equals(value)) {
				answer.append(value);
				idx = 0;
			} else if (idx % 2 == 0) {
				answer.append(value.toUpperCase());
				idx++;
			} else {
				answer.append(value.toLowerCase());
				idx++;
			}
		}
		return answer.toString();
	}
}