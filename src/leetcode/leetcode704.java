package leetcode;

//https://leetcode.com/problems/binary-search/
//704. Binary Search
public class leetcode704 {
	public static void main(String[] args) {
		System.out.println(new leetcode704().search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
		System.out.println(new leetcode704().search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
	}

	public int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}
		return -1;
	}
}