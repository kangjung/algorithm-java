package leetcode;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//116. Populating Next Right Pointers in Each Node
public class leetcode116 {
	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

	public Node connect(Node root) {
		Node start = null;
		Node copy = root;
		Node prev = null;
		while (copy != null && copy.left != null) {
			if (start == null) {
				start = copy.left;
				prev = start;
			} else {
				prev.next = copy.left;
				prev = prev.next;
			}
			prev.next = copy.right;
			prev = prev.next;
			copy = copy.next;
			if (copy == null) {
				copy = start;
				start = null;
			}
		}
		return root;
	}
}