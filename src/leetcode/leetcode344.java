package leetcode;

//https://leetcode.com/problems/reverse-string/
//344. Reverse String
public class leetcode344 {
	public void reverseString(char[] s) {
		int length = s.length - 1;
		for (int i = 0; i <= length / 2; i++) {
			char change = s[i];
			s[i] = s[length - i];
			s[length - i] = change;
		}
	}
}