package leetcode.easy;

public class MaximumDepthofBinaryTree104 {
	public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
	//最大深度与最小深度
}
