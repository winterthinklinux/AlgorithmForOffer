package nowcoder;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class minimumdepthofbinarytree {

	//�������ľ�������֮��С���������Ǿ����·���Ľڵ�����������������������DFS����ɣ����ܵĵݹ鰡�������뿴���룺
	 public int minDept(TreeNode root) {
 		if(root==null) return 0;
 		if (root.left == null && root.right == null) return 1;
 		if(root.left==null) return minDept(root.right)+1;
 		else if(root.right==null) return minDept(root.left)+1;
 		else  return Math.min(minDept(root.left), minDept(root.right))+1; 	
	 }
	
	
	//��ͨ�������ĸ߶�(������)
	 //�򵥵ĵݹ顣�ݹ������ǣ����������������������������Ⱥ��������������нϴ���Ǹ���1�����������ǣ��������սڵ�ʱ���������Ϊ0���õݹ��ʵ�����������������
	public int getDept(TreeNode root){
		
		if(root==null) return 0;
		
		return Math.max(getDept(root.left), getDept(root.right))+1;
		
	}
	//ʹ�ò��������������Ȼ������ܲ�������Ϊ��������������
	//�ݹ�ⷨ�����������������������Ϊ����������С��ȣ�����һ��Ҫ������ȫ���ڵ㡣��������ù�������������ǿ�����������һ��Ҷ�ӽڵ�ʱ����ֹ�����ص�ǰ��ȵġ�
	
	
}


