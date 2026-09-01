class Solution {
    public void rotate(int[] nums, int k) {
       int[] nums2=new int[nums.length];
       int count=k%nums.length;
       for(int i=0;i<nums.length;i++){
            nums2[(i+count)%nums.length]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
            nums[i]=nums2[i];
       }
    }
}