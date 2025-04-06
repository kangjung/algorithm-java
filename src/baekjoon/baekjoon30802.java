package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/30802
public class baekjoon30802 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			long n = Long.parseLong(br.readLine());

			long[] shirtSizes = new long[6];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++) {
				shirtSizes[i] = Long.parseLong(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			long t = Long.parseLong(st.nextToken());
			long p = Long.parseLong(st.nextToken());

			long tshirtBundles = 0;
			for (int i = 0; i < 6; i++) {
				tshirtBundles += (shirtSizes[i] + t - 1) / t;
			}

			long penBundles = n / p;
			long singlePens = n % p;

			System.out.println(tshirtBundles);
			System.out.println(penBundles + " " + singlePens);
		}
}