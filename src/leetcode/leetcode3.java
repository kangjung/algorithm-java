package leetcode;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//3. Longest Substring Without Repeating Characters
public class leetcode3 {
	public static void main(String[] args) {
		System.out.println(new leetcode3().lengthOfLongestSubstring("abcabcbb"));
		System.out.println(new leetcode3().lengthOfLongestSubstring("bbbbb"));
		System.out.println(new leetcode3().lengthOfLongestSubstring("pwwkew"));
	}

	public int lengthOfLongestSubstring(String s) {
		int size = s.length();
		if (size <= 0) {
			return 0;
		}
		ArrayList<Character> arr = new ArrayList<>();
		ArrayList<Integer> cnt = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			char c = s.charAt(i);
			if (!arr.contains(c)) {
				arr.add(c);
				if (i == size - 1) {
					cnt.add(arr.size());
				}
			} else {
				cnt.add(arr.size());
				for (int j = 0; j < arr.size();) {
					char arrChar = arr.get(j);
					arr.remove(j);
					if (arrChar == c) {
						break;
					}

				}
				arr.add(c);
			}
		}
		return Collections.max(cnt);
	}
}