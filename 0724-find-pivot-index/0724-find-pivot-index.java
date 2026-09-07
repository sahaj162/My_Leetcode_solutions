class Solution {
    public int pivotIndex(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(leftSum(nums, i) == rightSum(nums, i)) {
                return i;
            }
        }

        return -1;
    }

    public int leftSum(int[] nums, int e) {
        int sum = 0;

        for(int i = 0; i < e; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public int rightSum(int[] nums, int s) {
        int sum = 0;

        for(int i = s + 1; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}