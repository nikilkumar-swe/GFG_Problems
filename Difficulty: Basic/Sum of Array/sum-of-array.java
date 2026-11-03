class Solution {
	
	private int helper(int nums[], int idx) {
		if (idx == nums.length) {
			return 0;
		}
		return nums[idx]+helper(nums, idx + 1);
	}
	
	public int arraySum(int arr[]) {
		return helper(arr,0);
		
	}
}
