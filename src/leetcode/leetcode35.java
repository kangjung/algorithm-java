package leetcode;

//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
public class leetcode35 {
	public static void main(String[] args) {
		System.out.println(new leetcode35().searchInsert(new int[] { 1, 3, 5, 6 }, 5));
		System.out.println(new leetcode35().searchInsert(new int[] { 1, 3, 5, 6 }, 2));
		System.out.println(new leetcode35().searchInsert(new int[] { 1, 3, 5, 6 }, 7));
	}

	public int searchInsert(int[] nums, int target) {
		if (nums[0] >= target)
			return 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
			else if (nums[i - 1] < target && target < nums[i])
				return i;
		}
		return nums.length;
	}
}