package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/76501
public class programmers76501 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers76501().solution(new int[] {4,7,12}, new boolean[] {true,false,true}));
		System.out.println(new programmers76501().solution(new int[] {1,2,3}, new boolean[] {false,false,true}));
	}
	

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length ; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}
}