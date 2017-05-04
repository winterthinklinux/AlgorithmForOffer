package beautiful;

import java.util.HashMap;
import java.util.LinkedList;

public class Path {
	 public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
	        // write code here
	    	return check(a,b)||check(b,a);
	    }
	    public boolean check(UndirectedGraphNode a, UndirectedGraphNode b){
	       if(a==null||b==null) return false;
	       if(a==b) return false;
	       HashMap<UndirectedGraphNode,Boolean> map1 ;
	       LinkedList<UndirectedGraphNode> queue = new LinkedList<>();
	       queue.offer(a);
	       while(!queue.isEmpty()){
	           UndirectedGraphNode temp = queue.peek();
	           map1.put(temp,true);
	           for(int i=0;i<temp.neighbors.size();i++){
	               if(temp.neighbors.get(i)==b) return true;
	               
	           }
	       }
}
