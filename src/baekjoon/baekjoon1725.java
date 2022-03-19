package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/1725
public class baekjoon1725 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num =  Integer.parseInt(br.readLine());
		int[] arr = new int[num+2];
		int result =0;
		for(int i=1; i<num+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i=1; i<num+2; i++) {
			while(!stack.isEmpty()) {
				int top = stack.peek();
				if(arr[top] <= arr[i]) break;
				stack.pop();
				result = Math.max(result, arr[top]*(i-stack.peek()-1));
			}
		stack.push(i);
		}
		System.out.println(result);
	}
}
