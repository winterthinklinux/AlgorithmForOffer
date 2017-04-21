package cn.huawei;

import java.util.Scanner;
//×ªÉ«×Ó
public class Two {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		    int [] init ={1,2,3,4,5,6};
	        while (in.hasNextLine()) {
	            String string = in.nextLine();
	            char []  chs = string.toCharArray();
	            for(int i=0;i<chs.length;i++){
	            	
	            	if(chs[i]=='A'){

	            		int temp = init[0];
		            	init[0]=init[3];
	            		init[3]=init[1];
	            		init[1]=init[2];
	            		init[2]=temp;
	            	}
		            if(chs[i]=='C'){
	            		int temp = init[0];
	            		init[0]=init[2];
		            	init[2]=init[1];
		            	init[1]=init[3];
		            	init[3]=temp;
	            	}
		            if(chs[i]=='F'){
		            	int temp = init[2];
		            	init[2]=init[4];
	            		init[4]=init[3];
	            		init[3]=init[5];
	            		init[5]=temp;
	            	}
		            if(chs[i]=='B'){
		            	int temp = init[4];
		            	init[4]=init[2];
	            		init[2]=init[5];
	            		init[5]=init[3];
	            		init[3]=temp;
	            	}
		           if(chs[i]=='L'){
		        	  
	            		
	            		int temp = init[0];
	            		init[0]=init[4];
	            		init[4]=init[1];
	            		init[1]=init[5];
	            		init[5]=temp;
	            	}
		            if(chs[i]=='R'){
		            
	            		
	            		int temp = init[1];
		            	init[1]=init[4];
	            		init[4]=init[0];
	            		init[0]=init[5];
	            		init[5]=temp;
	            	}
		          
	            }
		     	for(int i=0;i<6;i++){
		     		System.out.print(init[i]);
		     	}
	        }
}
}
