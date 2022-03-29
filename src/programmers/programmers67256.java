package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/67256
public class programmers67256 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers67256().solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
		System.out.println(new programmers67256().solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
		System.out.println(new programmers67256().solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
	}
	

	public String solution(int[] numbers, String hand) {
		String answer = "";
		int leftHand = 10;
		int rightHand = 12;
		
		for(int i=0; i<numbers.length; i++){
			int num =numbers[i];
			if(num == 0) {
				num = 11; 
			}
			switch (num) {
				case 1: case 4: case 7:
					answer = answer + "L";
					leftHand = num;
					break;
				case 3: case 6: case 9:
					answer = answer + "R";
					rightHand = num;
					break;
				default:
					int left = (num > leftHand) ? num - leftHand : leftHand - num;
					int right = (num > rightHand) ? num - rightHand : rightHand - num;
					int leftChkNum = (left % 3) + (left / 3);
					int rightChkNum = (right % 3) + (right / 3);
					if(leftChkNum > rightChkNum) {
						answer = answer + "R";
						rightHand = num;
					} else if(rightChkNum > leftChkNum){
						answer = answer + "L";
						leftHand = num;
					} else {
						if("left".equals(hand)) {
							answer = answer + "L";
							leftHand = num;	
						} else {
							answer = answer + "R";
							rightHand = num;
						}
					}
					break;
			}
		}
		return answer;
	}
}