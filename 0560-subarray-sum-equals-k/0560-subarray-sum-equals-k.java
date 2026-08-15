class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;
        map.put(0, 1); // map.put(0, 1) is specifically used in prefix-sum + HashMap problems

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // updates the value of sum in each iteration.
        }
        return count;
    }
}