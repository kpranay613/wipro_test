package balancebinarytree;

public class BalancedBinaryTree {
	
	private int height(TreeNode root) {
		if(root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		
		if(Math.abs(height(root.left) - height(root.right)) > 1)
			return false;
		
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public static void main(String[] args) {
		BalancedBinaryTree tree = new BalancedBinaryTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println("Is the tree balanced : " +tree.isBalanced(root));
	}
}
