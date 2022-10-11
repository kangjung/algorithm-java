package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class programmers12945 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12945().solution(3));
		System.out.println(new programmers12945().solution(5));
	}

	public int solution(int n) {
		int answer = 0;
		int[][] arr = new int[n][2];

		arr[0][0] = 1;
		arr[1][1] = 1;

		for (int j = 2; j < arr.length; j++) {
			arr[j][0] = (arr[j - 1][0] + arr[j - 2][0]) % 1234567;
			arr[j][1] = (arr[j - 1][1] + arr[j - 2][1]) % 1234567;
		}
		for (int i = 2; i < n; i++) {
			answer = (arr[i][0] + arr[i][1]) % 1234567;
		}
		return answer;
	}
}