package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/81301
public class programmers81301 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers81301().solution("one4seveneight"));
		System.out.println(new programmers81301().solution("23four5six7"));
		System.out.println(new programmers81301().solution("2three45sixseven"));
		System.out.println(new programmers81301().solution("123"));
	}

	private int solution(String s) {
		String[][] arr = new String[][] {{"zero","0"},{"one","1"},{"two","2"},{"three","3"},{"four","4"},{"five","5"},{"six","6"},{"seven","7"},{"eight","8"},{"nine","9"}};
		int answer = 0;
		String word = "";
		String result = "";
		char tmp;
		for (int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);
			if(Character.isDigit(tmp)){
				result = result + tmp;
			} else {
				word = word + tmp;
				if(word.length() > 2) {
					for (int j = 0; j < arr.length; j++) {
						if(arr[j][0].equals(word)){
							result = result + arr[j][1];
							word = "";
						}
					}
				}
			}
		}
		answer = Integer.parseInt(result);
		return answer;
	}
}