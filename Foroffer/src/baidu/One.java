package baidu;

import java.util.Arrays;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			int [] a = new int[n];
			for(int i =0;i<n;i++){
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			int min = 0;
			int flag = 0;
			for(int i=0;i<a.length;i++){
				if(a[i]>min){
					min = a[i];
					flag++;
					if(flag==3)
						System.out.println(min);
				}
			}
			if(flag<3)
				System.out.println(-1);
		}
	}
	//第二种解法：TreeSet
	//第三种解法：ArrayList
}
