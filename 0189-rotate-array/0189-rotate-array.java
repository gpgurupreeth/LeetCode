class Solution {
    public void rotate(int[] nums, int k) {
        k=k%(nums.length);//in case nums.length+1 rotations then we have to do one 
        int[] nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[(i+k)%nums.length]=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=nums2[j];
        }
    }
}