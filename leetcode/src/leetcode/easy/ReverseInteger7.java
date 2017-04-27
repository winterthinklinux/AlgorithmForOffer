package leetcode.easy;

public class ReverseInteger7 {
	//Example1: x = 123, return 321
	//Example2: x = -123, return -321
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	public static int reverse(int x) {
		if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE) return 0;
		int sum = 0;
		if(x>0){
			while(x>0){
				int temp = x%10;
				sum = sum*10+temp;
				x = x/10;
			} 
		}
		else{
			int y =-x;
			while(y>0){
				int temp = y%10;
				sum = sum*10+temp;
				y = y/10;
			} 
			sum = -sum;
		}
		return sum;
	}
}
