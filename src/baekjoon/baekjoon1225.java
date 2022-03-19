package baekjoon;

import java.io.*;

//https://www.acmicpc.net/problem/1225
public class baekjoon1225 {
	public static void main(String[] args) throws Exception {
		long result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] text = br.readLine().split(" ");
		String[] n = text[0].split("");
		String[] m = text[1].split("");
		
		for(int i = 0; i < n.length ; i++) {
			for(int j = 0; j < m.length ; j++) {
				result += Long.parseLong(n[i]) * Long.parseLong(m[j]);
			}
		}
		
		System.out.println(result);
	}
}