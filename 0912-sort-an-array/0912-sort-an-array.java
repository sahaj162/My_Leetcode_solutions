class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int pivot = nums[low + (high - low) / 2];

        int i = low;
        int j = low;
        int k = high;

        while (j <= k) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
                j++;
            } 
            else if (nums[j] > pivot) {
                swap(nums, j, k);
                k--;
            } 
            else {
                j++;
            }
        }

        quickSort(nums, low, i - 1);
        quickSort(nums, k + 1, high);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}