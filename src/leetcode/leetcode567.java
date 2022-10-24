package leetcode;

//https://leetcode.com/problems/permutation-in-string
//567. Permutation in String
public class leetcode567 {
	public static void main(String[] args) {
		System.out.println(new leetcode567().checkInclusion("ab", "eidbaooo"));
		System.out.println(new leetcode567().checkInclusion("ab", "eidboaoo"));
	}

	public boolean checkInclusion(String s1, String s2) {
		char[] charArr = s1.toCharArray(), charArr2 = s2.toCharArray();
		int[] cnts = new int[256];
		for (char c : charArr) {
			cnts[c]++;
		}
		int left = charArr.length;
		for (int i = 0, j = 0; j < charArr2.length; j++) {
			if (cnts[charArr2[j]]-- > 0) {
				left--;
			}
			while (left == 0) {
				if (j + 1 - i == charArr.length) {
					return true;
				}

				if (++cnts[charArr2[i++]] > 0) {
					left++;
				}
			}
		}
		return false;
	}
}