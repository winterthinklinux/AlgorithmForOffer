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
}
