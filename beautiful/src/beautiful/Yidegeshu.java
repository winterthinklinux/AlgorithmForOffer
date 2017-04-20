package beautiful;

public class Yidegeshu {
	public static void main(String[] args) {
		
	}
	//二进制中一的个数
	public int NumberOf1_1(int n) {
		int count =0;
	  	while(n>0){
	  		if((n&1)==1)
	  		  count++;
	  		n = n>>1;
	  }
	  	return count;
	}
	//整数中一的个数
	public int NumberOf1(int n) {
		int count =0;
	  	while(n!=0){
	  		n=n&(n-1);
	  		count++;
	  }
	  	return count;
}
}
