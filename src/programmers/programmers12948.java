package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class programmers12948 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12948().solution("01033334444"));
		System.out.println(new programmers12948().solution("027778888"));
	}

    public String solution(String phone_number) {
		String answer = "";
		for(int i=0; i < phone_number.length()-4 ; i++) {
			answer += "*";
		}
		return answer + phone_number.substring(phone_number.length()-4, phone_number.length());
	}
}