package leetcode;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//1832. Check if the Sentence Is Pangram
public class leetcode1832 {
	public static void main(String[] args) {
		System.out.println(new leetcode1832().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(new leetcode1832().checkIfPangram("leetcode"));
	}

	public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26)
			return false;

		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (cnt > 25)
				break;
			if (sentence.contains(String.valueOf((char) (97 + i))))
				cnt++;
		}

		if (cnt == 26)
			return true;
		else
			return false;
	}
}