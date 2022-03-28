package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/86051
public class programmers86051 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers86051().solution(new int[] {1,2,3,4,6,7,8,0}));
		System.out.println(new programmers86051().solution(new int[] {5,8,4,0,6,7,9}));
	}

	public int solution(int[] numbers) {
		int answer = 45;
		for(int i=0; i<numbers.length; i++){
			answer -= numbers[i];
		}
		return answer;
	}
}