package leetcode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//19. Remove Nth Node From End of List
public class leetcode19 {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode copyHead = head;
		ListNode h = head;
		
		if (head == null)
			return null;

		while (n-- > 0) {
			h = h.next;
		}

		if (h == null)
			return head.next;

		while (h.next != null) {
			h = h.next;
			copyHead = copyHead.next;
		}
		copyHead.next = copyHead.next.next;
		return head;
	}
}