package leetcode.easy;

public class SameTree100 {
	//�õݹ��ж�����ȣ��ж��������ж��Ƿ�һ����������
	//�ж�����ȣ��õݹ飨ע��ݹ���˳�������
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
