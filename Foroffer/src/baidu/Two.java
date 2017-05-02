package baidu;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] type = new String[50];
		double [] x = new double[50];
		double [] y = new double[50];
		double [] z = new double[50];
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			type[i] = scanner.next();
			x[i] = scanner.nextDouble();
			y[i] = scanner.nextDouble();
			z[i] = scanner.nextDouble();
		}
		double ans = 0.0;
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++)
				for(int k=0;k<j;k++){
					int ok = 0;
					if(type[i].equals(type[j]))
						if(type[i].equals(type[k]))
							ok =1;
					if(!type[i].equals(type[j]))
						if(!type[i].equals(type[k]))
							if(!type[j].equals(type[k]))
								ok=1;
					if(ok==0) continue;
					double ux = x[j] - x[i], uy = y[j] - y[i], uz = z[j] - z[i];
	                double vx = x[k] - x[i], vy = y[k] - y[i], vz = z[k] - z[i];
	                double area = Math.sqrt( (ux * vy - vx * uy) + (uy * vz - vy * uz) + (uz * vx - ux * vz) );
	                ans = ans > area * 0.5 ? ans : area * 0.5;
					
				}
			
			System.out.println(ans);
		
	}
}
