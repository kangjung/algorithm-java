package baekjoon;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/2504
public class baekjoon2504 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Stack<String> stack = new Stack<>();
		String s = br.readLine();
		String[] arr = s.split("");
		int result = 0;
		int sum = 0;

		if(!"]".equals(arr[0]) && !")".equals(arr[0])){
			loopOut:
			for(int i=0; i<arr.length; i++) {
				String next = arr[i];
				if("(".equals(next) || "[".equals(next)){
					stack.push(next);
				}
				if(")".equals(next)){
					sum = 0;
					while(!stack.isEmpty()) {
						String prev = stack.peek();
						if (prev.equals("(")){
							stack.pop();
							stack.push(String.valueOf(sum == 0 ? 2  : (sum * 2)));
							break;
						} else if (prev.equals("[")){
							break loopOut;
						} else { 
							sum += Integer.parseInt(stack.pop());
						}
					}
				} else if ("]".equals(next)){
					sum = 0;
					
					while(!stack.isEmpty()) {
						String prev = stack.peek();
						if (prev.equals("[")){
							stack.pop();
							stack.push(String.valueOf(sum == 0 ? 3  : (sum * 3)));
							break;
							
						} else if (prev.equals("(")){
							break loopOut;
						} else { 
							sum += Integer.parseInt(stack.pop());
						}
					}
				}
			}
		}
        
        while(!stack.isEmpty()) {
			String peek = stack.peek();
			if (")".equals(peek) || "]".equals(peek) || "(".equals(peek) || "[".equals(peek)) {
				result = 0;
				break;
			}
			result += Integer.parseInt(peek);
			stack.pop();
		}
		System.out.println(result);
	}
}
