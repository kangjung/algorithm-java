package leetcode;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//2095. Delete the Middle Node of a Linked List
public class leetcode2095 {
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

	public ListNode deleteMiddle(ListNode head) {
		ListNode copyHead = head;
		ListNode h = head;
		int size = 0;
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		while (h != null) {
			size++;
			h = h.next;
		}
		int index = size / 2;
		while (index-- > 1) {
			head = head.next;
		}
		head.next = head.next.next;
		return copyHead;
	}
}