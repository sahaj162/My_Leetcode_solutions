class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int k = k1 + k2;
        int maxDiff = 0;
        int[] freq = new int[100001];

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            maxDiff = Math.max(maxDiff, diff);
        }

        for (int d = maxDiff; d > 0 && k > 0; d--) {
            int count = Math.min(freq[d], k);
            freq[d] -= count;
            freq[d - 1] += count;
            k -= count;
        }

        long ans = 0;

        for (int d = 1; d <= 100000; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}

// _____________________________DO AGAIN____________________________________