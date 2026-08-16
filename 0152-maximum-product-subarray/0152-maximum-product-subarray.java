class Solution {
    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<nums.length; i++){

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}

// n - 1 = fixed last index
// n - i - 1 = last index minus i → moves backward.
// like n-1 is for one time but n-i-1 is for each iteration 