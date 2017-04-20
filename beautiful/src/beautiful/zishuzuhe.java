package beautiful;

//连续子数组的最大和
public class zishuzuhe {
	public static void main(String[] args) {
		
	}
	//动态规划:
	public int FindGreatestSumOfSubArray2(int[] array) {
		int n = array.length;
		int End[] = new int [n];
		int All[] = new int [n];
		End[n-1]  = array[n-1];
		End[0] = All[0] = array[0];
		for(int i=1;i<n;i++){
			End[i] = Math.max(End[i-1]+array[i], array[i]);
			All[i] = Math.max(End[i], All[i-1]);
		}
		return All[n-1];
	}
	//优化的动态规划
	public int FindGreatestSumOfSubArray3(int[] array) {
		int n = array.length;
		int nAll = array[0];
		int nEnd = array[0];
		for(int i=1;i<n;i++){
			nEnd = Math.max(nEnd+array[i],array[i]);
			nAll = Math.max(nEnd, nAll);
		}
		return nAll;
	}
	public int FindGreatestSumOfSubArray(int[] array) {
	       if(array.length==0)
	           return 0;
	        int currSum = 0;
	        int maxSum = array[0];
	        
	        for(int j=0;j<array.length;j++){
	            if(currSum>=0)
	                currSum+=array[j];
	            else
	                currSum  = array[j];
	        if(currSum>maxSum)
	            maxSum = currSum;
	        }
	     return maxSum;       
	    } 
	       
	 
}
