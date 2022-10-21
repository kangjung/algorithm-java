package leetcode;

//https://leetcode.com/problems/integer-to-roman/
//12. Integer to Roman
public class leetcode12 {
	public static void main(String[] args) {
		System.out.println(new leetcode12().intToRoman(3));
		System.out.println(new leetcode12().intToRoman(58));
		System.out.println(new leetcode12().intToRoman(1994));
	}

	public String intToRoman(int num) {
		String result = "";

		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < symbol.length; i++) {
			while (value[i] <= num) {
				num -= value[i];
				result += symbol[i];
			}
		}
		return result;
	}
}