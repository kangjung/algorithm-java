package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class programmers12924 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12924().solution(15));
	}

	public int solution(int n) {
		int answer = 1;
		for(int i = 1; i <= n; i++){
			int sum = i;
			for(int j = i+1; j <= n; j++){
				sum += j;
				if(sum == n){
					answer++;
					break;
				}else if(sum > n){
					break;
				}
			}
		}
		return answer;
	}
}