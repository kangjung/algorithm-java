package programmers;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class programmers12981 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers12981().solution(3,
				new String[] { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" })));
		System.out.println(Arrays.toString(new programmers12981().solution(5,
				new String[] { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
						"establish", "hang", "gather", "refer", "reference", "estimate", "executive" })));
		System.out.println(Arrays.toString(new programmers12981().solution(2,
				new String[] { "hello", "one", "even", "never", "now", "world", "draw" })));

	}

	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		String word = words[0];
		char lastWord = word.charAt(word.length() - 1);
		ArrayList<String> prevWord = new ArrayList<>();
		prevWord.add(word);
		for (int i = 1; i < words.length; i++) {
			word = words[i];
			if (word.length() <= 1) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				return answer;
			}
			if (prevWord.contains(word)) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				return answer;
			}
			if (word.charAt(0) == lastWord) {
				prevWord.add(word);
				lastWord = word.charAt(word.length() - 1);
			} else {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				return answer;
			}
		}
		return answer;
	}
}