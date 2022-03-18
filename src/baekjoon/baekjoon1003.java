package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1003
public class baekjoon1003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[41][2];
		arr[0][0] = 1;
		arr[1][1] = 1;
		for(int j=2; j < arr.length; j++){
			arr[j][0] = arr[j-1][0]+arr[j-2][0];
			arr[j][1] = arr[j-1][1]+arr[j-2][1];
		}
		int test = Integer.parseInt(br.readLine());
		for (int i = 0; i < test; i++) {
			int next = Integer.parseInt(br.readLine());
			if(next == 0) {
				System.out.println("1 0");
				continue;
			} else if(next == 1){
				System.out.println("0 1");
				continue;
			} else {
				System.out.println(arr[next][0]+" "+arr[next][1]);
			}
		}
	}
}