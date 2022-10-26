package leetcode;

//https://leetcode.com/problems/merge-two-binary-trees/
//617. Merge Two Binary Trees
public class leetcode617 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return null;
		} else if (root2 == null) {
			return root1;
		} else if (root1 == null) {
			return root2;
		} else {
			TreeNode t = new TreeNode(root1.val + root2.val);
			t.left = mergeTrees(root1.left, root2.left);
			t.right = mergeTrees(root1.right, root2.right);
			return t;
		}
	}
}