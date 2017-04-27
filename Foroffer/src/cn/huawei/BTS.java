package cn.huawei;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



//利用队列实现深度优先搜索 。考察顶点2作为源点s的深度优先搜索。
public class BTS {
	
	public static int [][] graph= new int[101][101];
	static int [] dist = new int[101];
	static int [] pre = new int[101];
	static int [] color = new int[101];
	public static int INF = 0x3f3f3f3f;
	public static int NTL = -1;
	public static int  n=0;
	static void BFS(int s){
		
		for( int i=0;i<n;i++){
			color[i] = 0;//初始化为没放问
			dist[i] = INF;
			pre[i] = NTL;
		}
		color[s] = 1;
		dist[s] = 0;
		pre[s] = NTL;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(s);
		while(!queue.isEmpty()){
			int u = queue.peek();
			queue.poll();
			for(int i=0;i<n;i++){
				if(graph[u][i]!=0&&color[i] ==0){
					color[i] = 1;
					dist[i] = dist[u]+1;
					pre[i] = u;
					queue.offer(i);
				}
			}
			color[u] = 0;
		}	
	}
	static void showPath(int s,int dest){
		if(s==dest){
			System.out.print(s);
			return;
		}else if(pre[dest]==NTL){
			System.out.println("No Path From " + s + " to " +dest );
			
		}else{
			showPath(s, pre[dest]);
			System.out.print(" "+dest);
		}
	}
	public static void main(String[] args) throws IOException {
		
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNextInt()){
				for(int i =0;i<8;i++)
					for(int j=0;j<8;j++)
						graph[i][j] = scanner.nextInt();
			}
            BFS(2);
    		for (int i = 0; i < n; ++i)
    		{
    		   System.out.println("从s点（顶点2）到  "+i+" 路径为: ");
    		   showPath(2, i);
    		   System.out.println("");
    		   
    		   System.out.println( "经历的边数为: "+dist[i]);
    		   System.out.println("*************************************\n");
    		
    		}
        }
	
}
