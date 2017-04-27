package leetcode.easy;
/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
For example, giventhe array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
 * */

//�ⷨһ:-2,1,-3,4,-1,2,1,-5,4
//     -2,1,1, 4,4,5,6,6,6
public class MaximumSubarray53 {
   public static int maxSubArray(int[] nums) {
	   int max = Integer.MIN_VALUE;
	   int sum = 0;
	   for(int i=0;i<nums.length;i++){
		   sum +=nums[i];
		   if(sum>max)
			   max = sum;
		   if(sum<0)
			   sum =0;
	   }
	   return max;   
    }
   public static void main(String[] args) {
//	int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//	int [] nums = {-2,1};
	int [] nums = {-2,1,-3,4,-1,2,1,-5,4}; 
	System.out.println(maxSubArray(nums)); 
   }
}
