package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/82612
public class programmers82612 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers82612().solution(3,20,4)); //10
		System.out.println(new programmers82612().solution(3,40,4)); //0
	}

	public long solution(int price, long money, int count) {
		long answer = 0;
		long sumPrice = 0;

		for(int i = 0; i< count ;i++) {
			sumPrice += price;
			money = money - sumPrice;
		}
		answer = money > 0 ?  0 : money * -1;
		return answer;
	}
}