package leetcode;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
//237. Delete Node in a Linked List
public class leetcode237 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}