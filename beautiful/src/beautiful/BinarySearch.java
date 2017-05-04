package beautiful;

public class BinarySearch{
	/**
	 * 
	 * @param a
	 * @param key
	 * @return
	 */
	public static int TestBinarySearch(int [] a,int key){
		int low = 0;
		int high = a.length-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(a[mid]>key)
				high = mid-1;
			else if(a[mid]<key)
				low = mid+1;
			else 
				return mid;
		
		}
	
		return -1;
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8};
		System.out.println(TestBinarySearch(a, 2));
	}

}
