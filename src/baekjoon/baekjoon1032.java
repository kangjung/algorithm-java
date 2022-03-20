package baekjoon;

import java.util.*;

//https://www.acmicpc.net/problem/1032
public class baekjoon1032 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			boolean check = false;

			String[] cmd = new String[n];
			for (int i=0; i<n; i++) {
				cmd[i] = s.next();
			}
			
			for (int i=0; i<cmd[0].length(); i++){
				check = false;
				for (int j=0; j<n-1; j++){
					if (cmd[j].charAt(i) != cmd[j+1].charAt(i)){
						check = true;
						break;
					}
				}
				System.out.print(check ? "?" : cmd[0].charAt(i));
			}
		}
	}
}