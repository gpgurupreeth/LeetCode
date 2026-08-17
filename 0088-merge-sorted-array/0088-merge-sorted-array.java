class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size=nums1.length-1;
        int k=0;
        while(n>0){
            if(nums1[size]==0){
                nums1[size]=nums2[k];
                n--;
                k++;
                size--;

            }
        }
        Arrays.sort(nums1);
    }
}