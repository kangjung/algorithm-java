package leetcode;

//https://leetcode.com/problems/count-and-say/
//38. Count and Say
public class leetcode38 {
	public static void main(String[] args) {
		System.out.println(new leetcode38().countAndSay(1));
		System.out.println(new leetcode38().countAndSay(4));
	}

	public String countAndSay(int n) {
		StringBuilder result = new  StringBuilder("1");
		StringBuilder str;
		int cnt = 0;
		char prev = '1';
		while (--n > 0) {
			str = result;
			result = new StringBuilder();
			cnt = 1;
			prev = str.charAt(0);
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) != prev) {
					result.append(cnt).append(prev);
					cnt = 1;
					prev = str.charAt(i);
				} else {
					cnt++;
				}
			}
			result.append(cnt).append(prev);
		}
		return result.toString();
	}
}