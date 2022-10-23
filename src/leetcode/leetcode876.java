package leetcode;

//https://leetcode.com/problems/middle-of-the-linked-list/
//876. Middle of the Linked List
public class leetcode876 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode middleNode(ListNode head) {
		ListNode copyHead1 = head;
		ListNode copyHead2 = head;
		while (copyHead2 != null && copyHead2.next != null) {
			copyHead1 = copyHead1.next;
			copyHead2 = copyHead2.next.next;
		}
		return copyHead1;
	}
}