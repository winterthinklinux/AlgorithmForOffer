package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
//树的逆层次遍历
public class BinaryTreeLevelOrderTraversalII107 {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	   List<List<Integer>> list = new ArrayList<>();
	   List<Integer> temp = new ArrayList<Integer>();
	   Queue<TreeNode> queue = new LinkedList<>();
	   if(root==null)
			return list;
	   queue.offer(root);
//	   int i=1;非完全二叉树此方案不可取
	   while(!queue.isEmpty()){
		   TreeNode treeNode = queue.poll();
		   temp.add(treeNode.val);
//		   if(temp.size()==TwodeNciFang(i)-1){
//			   list.add(temp);
//			   temp =null;
//			   i++;
//		   }				//2^n-1
		   if(treeNode.left!=null)
			   queue.offer(treeNode.left);
		   if(treeNode.right!=null)
			   queue.offer(treeNode.right);
	   }
	   Collections.reverse(list);
	   return list;
	 }
	 public int TwodeNciFang(int n){
		 int sum =1;
		 for(int i=1;i<=n;i++)
			 sum = sum*2;
		 return sum;
	 }
	 //
	 ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

	    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		     if(pRoot == null){
				return result;
			 }
	        Queue<TreeNode> layer = new LinkedList<TreeNode>();
	        ArrayList<Integer> layerList = new ArrayList<Integer>();
	        layer.offer(pRoot);
	        int start = 0, end = 1;
	        int flag =0;
	        while(!layer.isEmpty()){
					TreeNode cur= layer.poll();
					layerList.add(cur.val);
					start++;
					if(cur.left!=null){
						layer.offer(cur.left);  }          
					if(cur.right!=null){
						layer.offer(cur.right);}
					
	                if(start == end){
	                     end = layer.size();
	                     start = 0;
	                     if(flag%2==1){
	                    	 
	                    	 //反转layerList
	                         Stack<Integer> stack  = new Stack<>();
	                         for(int i=0;i<layerList.size();i++)
	                        	 stack.push(layerList.get(i));
	                         int j=0;
	                         while(!stack.isEmpty()){
	                        	 layerList.set(j, stack.pop());
	                        	 j++;
	                         }
	                     }
	                    
	                     result.add(layerList);
	                     layerList = new ArrayList<Integer>();
	                     flag++;
	                  }
	          }
	           
	   
	         return result;
	         
	    }
}

