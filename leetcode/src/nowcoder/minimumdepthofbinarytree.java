package nowcoder;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class minimumdepthofbinarytree {

	//二叉树的经典问题之最小深度问题就是就最短路径的节点个数，还是用深度优先搜索DFS来完成，万能的递归啊。。。请看代码：
	 public int minDept(TreeNode root) {
 		if(root==null) return 0;
 		if (root.left == null && root.right == null) return 1;
 		if(root.left==null) return minDept(root.right)+1;
 		else if(root.right==null) return minDept(root.left)+1;
 		else  return Math.min(minDept(root.left), minDept(root.right))+1; 	
	 }
	
	
	//普通的求树的高度(最大深度)
	 //简单的递归。递归条件是，它的最大深度是它左子树的最大深度和右子树最大深度中较大的那个加1。基础条件是，当遇到空节点时，返回深度为0。该递归的实质是深度优先搜索。
	public int getDept(TreeNode root){
		
		if(root==null) return 0;
		
		return Math.max(getDept(root.left), getDept(root.right))+1;
		
	}
	//使用层序遍历二叉树，然后计数总层数，即为二叉树的最大深度
	//递归解法本质是深度优先搜索，但因为我们是求最小深度，并不一定要遍历完全部节点。如果我们用广度优先搜索，是可以在遇到第一个叶子节点时就终止并返回当前深度的。
	
	
}


