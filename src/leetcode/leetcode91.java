package leetcode;

//https://leetcode.com/problems/decode-ways/
public class leetcode91 {
	public static void main(String[] args) {
		System.out.println(new leetcode91().numDecodings("12"));
		System.out.println(new leetcode91().numDecodings("226"));
		System.out.println(new leetcode91().numDecodings("06"));
	}
	
	public int numDecodings(String s) {
		int result = 0;
		int size = s.length();
		int[] arr = new int[size];
		
		if(s.charAt(0) == '0') {
			return result;
		}
		arr[0] = 1;
		
		if(size == 1) {
			return 1;
		}
		
		for( int i = 1 ; i < size; i++) {
			char num = s.charAt(i);
			if(num > '0') {
				arr[i] += arr[i-1];
			}
			if((s.charAt(i-1) == '2' && num <= '6') || (s.charAt(i-1) == '1' && num <= '9')) {
				arr[i] += (i >= 2) ? arr[i-2] : 1;
			}
		}
		result = arr[size -1];
		return result;
	}
}