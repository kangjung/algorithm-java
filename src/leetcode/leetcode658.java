package leetcode;

import java.util.*;

//https://leetcode.com/problems/find-k-closest-elements/
public class leetcode658 {
	public static void main(String[] args) {
		System.out.println(new leetcode658().findClosestElements(new int[] { 1, 2, 3, 4, 5 },4,3));
		System.out.println(new leetcode658().findClosestElements(new int[] { 1, 2, 3, 4, 5 },4,-1));
	}
	
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> result = new ArrayList<Integer>();
		int[][] nums = new int[arr.length][2];
		
		for(int i= 0 ; i < arr.length; i++) {
			nums[i][0] = arr[i];
			nums[i][1] = Math.abs(arr[i]-x);
		}
		Arrays.sort(nums,Comparator.comparingInt(a1 -> a1[1]));
		for(int i= 0 ; i < k; i++) {
			result.add(nums[i][0]);
		}
		Collections.sort(result);
		return result;
	}
}