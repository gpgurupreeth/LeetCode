class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] second=new int[nums.length];
        int even=0;
        int odd=1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                second[even]=nums[i];
                even=even+2;
            }
            else{
                second[odd]=nums[i];
                odd=odd+2;
            }
        }
        return second;
    }
}