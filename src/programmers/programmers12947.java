package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12947
public class programmers12947 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers12947().solution(10));
		System.out.println(new programmers12947().solution(12));
		System.out.println(new programmers12947().solution(11));
		System.out.println(new programmers12947().solution(13));
	}
	
    public boolean solution(int x) {
        boolean answer = true;
        int oriNumber = x;
        int number = 0;

        while(x > 0){
            number += (x % 10);
            x = x / 10;
        }
        if(oriNumber%number != 0){
            answer = false;
        }
        return answer;
    }
}