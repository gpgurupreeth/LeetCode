class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
     return j+1;
    }
}