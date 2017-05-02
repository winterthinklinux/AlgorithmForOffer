package cn.TwoZeroOneSix;

public class BinarySearch {
    public static int getPos(int[] A, int n, int val) {
        // write code here
   		int low = 0,high = n-1;
        while(low<=high){
            int mid  =(low+high)/2;
            if(A[mid]>val)
                high = mid-1;
            else if(A[mid]<val)
                low = mid+1;
            else 
            	return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
		int [] a = {9,13,21,31};
		System.out.println(getPos(a, 4, 9));
	}
}
