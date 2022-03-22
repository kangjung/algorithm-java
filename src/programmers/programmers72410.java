package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/72410
public class programmers72410 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers72410().solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(new programmers72410().solution("z-+.^."));
		System.out.println(new programmers72410().solution("=.="));
		System.out.println(new programmers72410().solution("123_.def"));
		System.out.println(new programmers72410().solution("abcdefghijklmn.p"));
	}

	public String solution(String new_id) {
		String answer = new_id;
		//1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		answer = answer.toLowerCase();
		//2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		answer = answer.replaceAll("[^0-9a-z_.\\-]+", "");
		//3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		answer = answer.replaceAll("\\.+", ".");
		//4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		if(".".equals(answer.substring(0,1))){
			answer = answer.substring(1, answer.length());
		}
		if(answer.length() > 0 && ".".equals(answer.substring(answer.length()-1))){
			answer = answer.substring(0, answer.length()-1);
		}
		//5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		if("".equals(answer.trim())) {
			answer = "a";
		}
		//6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
		//���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if(".".equals(answer.substring(answer.length()-1))){
				answer = answer.substring(0, answer.length()-1);
			}
		}
		//7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		if(answer.length() <= 2) {
			for(int i = answer.length(); i < 3; i++) {
				answer = answer + answer.substring(answer.length()-1);
			}
		}
		return answer;
	}
}