package dp;

import java.util.Scanner;

public class UpStairs {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			for(int k=0;k<n;k++){
				int m = scanner.nextInt();
				int [] dp = new int[41];
				dp[0] = 0;dp[1] = 1;dp[2] = 2;
				for(int i=3;i<m;i++){
					dp[i] = dp[i-1]+dp[i-2];
				}
				System.out.println(dp[m-1]);
			}
			
		}
		
	}
}
