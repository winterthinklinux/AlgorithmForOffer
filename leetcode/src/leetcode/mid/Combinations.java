package leetcode.mid;

import java.util.ArrayList;

public class Combinations {
	//combinations
	//求 C(n, k) 的所有组合。
   public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	
	   ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	   for(int i=1;i<n;i++){
		   for(int j = i+1;j<=n;j++){
			   ArrayList<Integer> temp = new ArrayList<>();
			   temp.add(i);
			   temp.add(j);
			   list.add(temp);
		   }
	   }
	   return list;
        
   }
}
