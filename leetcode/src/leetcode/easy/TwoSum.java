package leetcode.easy;
//时间复杂度O(n^2)空间复杂度O(1)
public class TwoSum {
	public static  int[] twoSum(int[] nums, int target) {
        int [] result = new int [2];
        for(int i=0;i<nums.length-1;i++)
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
       return result;
    }
	public static void main(String[] args) {
		int [] nums = {3,2,4};
		int [] result = twoSum(nums, 6);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
