package beautiful;

public class Yidegeshu {
	public static void main(String[] args) {
		
	}
	//��������һ�ĸ���
	public int NumberOf1_1(int n) {
		int count =0;
	  	while(n>0){
	  		if((n&1)==1)
	  		  count++;
	  		n = n>>1;
	  }
	  	return count;
	}
	//������һ�ĸ���
	public int NumberOf1(int n) {
		int count =0;
	  	while(n!=0){
	  		n=n&(n-1);
	  		count++;
	  }
	  	return count;
}
}
