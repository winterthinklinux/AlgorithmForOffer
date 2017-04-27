package dp;

import java.util.Scanner;

public class GetFlowers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		//s[i][j]代表从初始结点经过i次到达j的方法
		int [][] s= new int [35][35];
		s[0][1] =1;
		s[1][2] =1;
		s[1][n] =1;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(j==1){
					s[i][1] = s[i-1][2]+s[i-1][n];
				}else if(j==n){
					s[i][n] = s[i-1][1]+s[i-1][n-1];
					
				}
				else {
					s[i][j] = s[i-1][j-1]+s[i-1][j+1];
				}
			}
			
		}
		System.out.println(s[m][1]);
	}
}
