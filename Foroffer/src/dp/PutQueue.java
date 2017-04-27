package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class PutQueue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int m = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int j =1;j<=m;j++){
				list.add(j);
			}
			while(list.size()>=3){
				list.remove(1);
				while(list.size()>=3){
					list.remove(2);
				}
			}
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j)+" ");	
			}
			System.out.println();	
		}
	}
}
