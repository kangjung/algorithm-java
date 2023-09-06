package leetcode;

import java.util.*;

//https://leetcode.com/problems/single-number/
//136. Single Number
public class leetcode136 {
	public static void main(String[] args) {
		System.out.println(new leetcode136().singleNumber(new int[] { 2, 2, 1 }));
		System.out.println(new leetcode136().singleNumber(new int[] { 4, 1, 2, 1, 2 }));
		System.out.println(new leetcode136().singleNumber(new int[] { 1 }));
		System.out.println(new leetcode136().singleNumber(new int[] {  }));

	}

	public int singleNumber(int[] nums) {
		int len = nums.length;
		if(len == 1){
			return nums[0];
		} else if(len  < 1 ){
			return -1;
		}
		Set<Integer> set = new HashSet<>();
		for(int i =0; i < len; i++) {
			if(set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);	
			}
			
		}
		return set.stream().findFirst().get();
	}
}