class Solution {
    public void rotate(int[] nums, int k) {
        k=k%(nums.length);
        int[] nums2=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            nums2[(i+k)%nums.length]=nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums2[i];
        }
    }
}