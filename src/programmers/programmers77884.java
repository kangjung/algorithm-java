package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/77884
public class programmers77884 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers77884().solution(13,17));
		System.out.println(new programmers77884().solution(24,27));
	}
	
	public int solution(int left, int right) {
		int answer = 0;
		for(int i = left; i <=right ; i++){
			int cnt = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) cnt++;
			}
			
			if(cnt % 2 ==0) {
				answer += i; 
			} else {
				answer -= i;
			}
		}
		return answer;
	}
}