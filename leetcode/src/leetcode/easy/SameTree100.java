package leetcode.easy;

public class SameTree100 {
	//用递归判断树相等，判断树镜像，判断是否一个树的子树
	//判断树相等，用递归（注意递归的退出条件）
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 
		 if(p==null&&q==null) return true;
		 if(p==null&&q!=null) return false;
		 if(p!=null&&q==null) return false;
		 boolean flag = false;
		 if(p.val==q.val){
			flag = isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		 }
		 return flag;
	        
	 }
}
