package leetcode;

//https://leetcode.com/problems/power-of-two/
//231. Power of Two
public class leetcode231 {
	public static void main(String[] args) {
		System.out.println(new leetcode231().isPowerOfTwo(1));
		System.out.println(new leetcode231().isPowerOfTwo(16));
		System.out.println(new leetcode231().isPowerOfTwo(3));
	}

	public boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		if ((n & (n - 1)) == 0)
			return true;
		return false;
	}
}