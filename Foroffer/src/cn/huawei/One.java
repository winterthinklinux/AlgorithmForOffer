package cn.huawei;

import java.util.Scanner;
//一行输入123,123
//输出642
//两个子字符串转整形
public class One {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 while (in.hasNextLine()) {
	            String string= in.nextLine();
	            String[] str = string.split(",");
	            int tempa = Integer.valueOf(str[0]);
	            int tempb = Integer.valueOf(str[1]);
	            if(tempa<1||tempa>70000||tempb<1||tempb>70000)
	            	System.out.println("-1");
	            
	            else{	
		            char[] chs1 = str[0].toCharArray();
		            int a=0;
		            for(int i=chs1.length-1;i>=0;i--)
		            {
		            	a=a*10+(chs1[i]-'0');
		            	
		            }
		            char[] chs2 = str[1].toCharArray();
		            int b=0;
		            for(int i=chs2.length-1;i>=0;i--)
		            {
		            	b=b*10+(chs2[i]-'0');
		            }
		         
		            System.out.println(a+b);	
	            }			 
		
	     }
		
	}

}
