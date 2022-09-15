package programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42889
public class programmers42889 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers42889().solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })));
		System.out.println(Arrays.toString(new programmers42889().solution(4, new int[] { 4, 4, 4, 4, 4 })));
	}

	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] silpae = new double[N];
		int stage = 1;
		double silpaeyul = 0;

		int playerCnt = stages.length;

		for (int i = 0; i < playerCnt; i++) {
			stage = stages[i];
			if (N < stage) {
				silpae[N - 1] = silpae[N - 1] + 0;
			} else {
				silpae[stage - 1] = silpae[stage - 1] + 1;
			}
		}

		for (int i = 0; i < N; i++) {
			silpaeyul = silpae[i] / playerCnt;
			playerCnt = playerCnt - (int) silpae[i];
			silpae[i] = silpaeyul;
			answer[i] = i + 1;
		}

		for (int i = N - 1; i >= 1; i--) {
			for (int j = N - 1; j >= (N - i); j--) {
				if (silpae[j - 1] < silpae[j]) {
					double temp = silpae[j - 1];
					silpae[j - 1] = silpae[j];
					silpae[j] = temp;
					int temp2 = answer[j - 1];
					answer[j - 1] = answer[j];
					answer[j] = temp2;
				}
			}
		}
		return answer;
	}
}