package beautiful;

public class Sort {
	public static void main(String[] args) {
		
	}
	public void quickSort(int [] a ,int low,int high){
		if(null == a||a.length<2) return ;
		if(low<high){
			int pivot = partition(a,low,high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
	}
	public int partition(int  [] a,int low,int high){
		int key = a[low];
		while(low<high){
			while(low<high&&a[high]>key)
				high--;
			a[low] = a[high];
			while(low<high&&a[low]<key)
				low++;
			a[high] = a[low];
		}
		a[low] = key;
		return low;
	}
}
