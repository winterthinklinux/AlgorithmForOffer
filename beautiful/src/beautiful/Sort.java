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
	public void MergeSort(int [] a,int low,int high){
		if(null==a||a.length<2) return ;
		if(low<high){
			int mid=(low+high)/2;
			MergeSort(a, low, mid);
			MergeSort(a, mid+1, high);
			Merge(a,low,mid,high);
		}
	}
	public void Merge(int [] a ,int low,int mid,int high){
		int [] temp = new int[high-low+1];
		int i = low;
		int j = mid+1;
		int k = 0;
		while(i<=mid&&j<high){
			if(a[i]<= a[j])  temp[k++] = a[i++];
			else temp[k++] = a[j++];
		}
		while(i<=mid) temp[k++] = a[i++];
		while(j<=high) temp[k++] = a[j++];
		for(int t=0;t<temp.length;t++)
			temp[low+t] = a[t];
	}
	public void heapSort(int [] a){
		if(null==a||a.length<2) return ;
		buildMaxHeap(a);
		for(int i=a.length;i>=0;i--){
			int temp = a[i];
			a[i] = a[0];
			a[0] = a[temp];
			adjustHeap(a,a.length,0);
		}
	}
	public void buildMaxHeap(int [] a){
		int mid =a.length/2;
		for(int i =mid;i>=0;i--)
			adjustHeap(a,a.length,i);
		
	}
	public void adjustHeap(int [] a,int size,int parent){
		int left = 2*parent+1;
		int right = 2*parent+2;
		int largest = parent;
		if(left<size&&a[left]>a[largest])
			largest = left;
		if(right<size&&a[right]>a[largest])
			largest = right;
		if(largest!=parent){
			int temp =a[largest];
			a[largest] =a[parent];
			a[parent] = temp;
			adjustHeap(a, size, largest);
		}
		
	}
}
