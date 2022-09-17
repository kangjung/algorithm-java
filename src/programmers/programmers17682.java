package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/17682
public class programmers17682 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers17682().solution("1S2D*3T"));
		System.out.println(new programmers17682().solution("1D2S#10S"));
		System.out.println(new programmers17682().solution("1D2S0T"));
		System.out.println(new programmers17682().solution("1S*2T*3S"));
		System.out.println(new programmers17682().solution("1D#2S*3S"));
		System.out.println(new programmers17682().solution("1T2D3D#"));
		System.out.println(new programmers17682().solution("1D2S3T*"));
	}

	public int solution(String dartResult) {
		int answer = 0;
		char dart;
		double score = 0;
		int chack[] = new int[3];
		int j = 0;

		for (int i = 0; i < dartResult.split("").length; i++) {
			dart = dartResult.charAt(i);
			if (score != 0 && dart >= '0' && dart <= '9') {
				score = 0;
				j++;
			}
			if (dart == '1' && dartResult.charAt(i + 1) == '0') {
				score = 10;
				i++;
			} else if (dart >= '0' && dart <= '9') {
				score = (int) dart - '0';
			} else if (dart == 'S') {
				chack[j] = (int) Math.pow(score, 1);
			} else if (dart == 'D') {
				chack[j] = (int) Math.pow(score, 2);
			} else if (dart == 'T') {
				chack[j] = (int) Math.pow(score, 3);
			} else if (dart == '*') {
				chack[j] = chack[j] * 2;
				if (j != 0) {
					chack[j - 1] = chack[j - 1] * 2;
				}
				j++;
				score = 0;
			} else if (dart == '#') {
				chack[j] *= -1;
				j++;
				score = 0;
			}
		}
		answer = chack[0] + chack[1] + chack[2];
		return answer;
	}
}