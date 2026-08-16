class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int []nums3 = new int[m + n];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
      
        if(nums1[i] >= nums2[j]){
            nums3[k++] = nums2[j++];
        }else if(nums1[i] <= nums2[j]){
            nums3[k++] = nums1[i++];
        }

        }

        while(i < m){
            nums3[k++] = nums1[i++];
        }

        while(j < n){
            nums3[k++] = nums2[j++];
        }

        for(int s=0; s<nums3.length; s++){
            nums1[s] = nums3[s];
        }
        
    }
}