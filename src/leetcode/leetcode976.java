package leetcode;

import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/largest-perimeter-triangle/
//976. Largest Perimeter Triangle
public class leetcode976 {
	public static void main(String[] args) {
		System.out.println(new leetcode976().largestPerimeter(new int[] { 2, 1, 2 }));
		System.out.println(new leetcode976().largestPerimeter(new int[] { 1, 2, 1 }));
	}

	public int largestPerimeter(int[] nums) {
		Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] < arr[i + 1] + arr[i + 2]) {
				return arr[i] + arr[i + 1] + arr[i + 2];
			}
		}
		return 0;
	}
}