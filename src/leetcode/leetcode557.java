package leetcode;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
//557. Reverse Words in a String III
public class leetcode557 {
	public static void main(String[] args) {
		System.out.println(new leetcode557().reverseWords("Let's take LeetCode contest"));
		System.out.println(new leetcode557().reverseWords("God Ding"));
	}

	public String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		
		String[] arr = s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			result.append(new StringBuffer(arr[i]).reverse()).append(" ");
		}
		return result.toString().trim();
	}
}